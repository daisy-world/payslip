package com.fokuswork.payslip.controller;



import java.awt.Desktop;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/** Exercise the Desktop class. */
public final class EmailClient {
	
	
	String emailId;
	String month;
	int year;
	String attachpath;
	
	
	public EmailClient(String email,String month1,int year1,String attachPath1) throws IOException{
		
		
		emailId =email;
		month = month1;
		year = year1;
		attachpath = attachPath1;
		
		if(Desktop.isDesktopSupported()){
		    
		    
		     composeEmail();
		    }
		    else {
		      log("Desktop is not supported by this host.");
		    }
		  }
		 
		
		
	


  
  /** 
   Opens the default email client with prepopulated content, but doesn't send the email.
   You should test your own email clients and character sets.
 * @throws IOException 
  */
  void composeEmail() throws IOException{
  
    	
    	 String runThunder ="cmd /c start thunderbird.exe -compose ";
		 
		
		
		String url ="to="+emailId;
		String subject ="subject="+getEmailSubject();
		String body="body="+getEmailBody();
		String attachment ="attachment="+attachpath;
		System.out.println("Attached path:"+attachment);
    	
      
		String command =runThunder+url+","+subject+","+body+","+attachment;
		
		
		 Runtime.getRuntime().exec(command); 
 
  }
 


// PRIVATE
  private Desktop fDesktop = Desktop.getDesktop(); 

  private static final Pattern SIMPLE_CHARS = Pattern.compile("[a-zA-Z0-9]");
 
  private static void log(Object aMessage){
    System.out.println(String.valueOf(aMessage));
  }
  
  private String getEmailSubject(){
    return encodeUnusualChars("PaySlip ("+month+" "+year+")");
  }
  
  private String getEmailBody(){
    StringBuilder result = new StringBuilder();
    String NL = System.getProperty("line.separator"); 
    result.append("Hi,");
    result.append(NL);
    result.append(NL);
    //exercises a range of common characters :
    result.append("Please find the attachment of your payslip for the month of "+month+" "+year+" .");
    return encodeUnusualChars(result.toString());
  }
  

  /** 
   This is needed to handle special characters.
   This method hasn't been tested with non-Latin character sets.
   
   Encodes all text except characters matching [a-zA-Z0-9]. 
   All other characters are hex-encoded. The encoding is '%' plus the hex 
   representation of the character in UTF-8. 
   
   <P>See also :
   http://tools.ietf.org/html/rfc2368 - mailto
   http://tools.ietf.org/html/rfc1738 - URLs
  */
  private String encodeUnusualChars(String aText){
    StringBuilder result = new StringBuilder();
    CharacterIterator iter = new StringCharacterIterator(aText);
    for(char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
      char[] chars = {c};
      String character = new String(chars);
      if(isSimpleCharacter(character)){
        result.append(c);
      }
      else {
        hexEncode(character, "UTF-8", result);
      }
    }
    return result.toString();
  }
  
  private boolean isSimpleCharacter(String aCharacter){
    Matcher matcher = SIMPLE_CHARS.matcher(aCharacter);
    return matcher.matches();
  }
  
  /**
   For the given character and encoding, appends one or more hex-encoded characters.
   For double-byte characters, two hex-encoded items will be appended.
  */
  private static void hexEncode(String aCharacter, String aEncoding, StringBuilder aOut) {
    try  {
      String HEX_DIGITS = "0123456789ABCDEF"; 
      byte[] bytes = aCharacter.getBytes(aEncoding);
      for (int idx = 0; idx < bytes.length; idx++) {
        aOut.append('%');
        aOut.append(HEX_DIGITS.charAt((bytes[idx] & 0xf0) >> 4));
        aOut.append(HEX_DIGITS.charAt(bytes[idx] & 0xf));
      }
    }
    catch (UnsupportedEncodingException ex) {
      log(ex.getStackTrace());
    }
  }
} 
