package com.fokuswork.payslip.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.text.DecimalFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@RestController
public class SalarySeawavesItController {
	
	public static		String format 		= "PAYSLIP FOR THE MONTH OF" ;
	public static		String month ="mar";
	public static		String year	="2019";
	static Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	
	
	public static		String    empid = "I009";
	public static 		int    payabledays = 31;
	public static 		String name = "Anil Kumar Sahoo"	;
	public static		String 	pan	="DNEPS3737N"	;
	public static 		String bank	= "IDBI Bank"	;	
	public static 		String date = "15/01/2015"	;
	public static 		String   acc  = "0042104000387729"   ;
	public static 		String designation = "Senior Software Developer";
	
	static DecimalFormat decimalFormat = new DecimalFormat( "###,##0.00");
	static DecimalFormat decimalFormat1 = new DecimalFormat( "###,###");
	
	
	public static       double    sal 	= 43000		;
	public static       double    provident_fund 	= 0.000d ;
	public static       double    special_allowance = 0.000d	;
	public static       double    bonus 	;
	public static       double    tax_deduction 	;
	
	
	public static		double    total = sal;
	
	static NumberToWord obj = new NumberToWord();
		
	public static  String word = obj.wordConvert(total);
	
	@GetMapping("/anil22")
	public String m1() throws DocumentException, MalformedURLException, IOException {
		
		 Document document = new Document();
		 
		 ByteArrayOutputStream baos = new ByteArrayOutputStream();
		 OutputStream file = new FileOutputStream(new File("C:\\Users\\ANIL\\Desktop\\pdf_test\\marrrr2019.pdf"));
		 PdfWriter.getInstance(document,  file);
		
		
		 document.open();
		 
		 PdfPTable table = createTable1();
         document.add(table);
         
         table = imageTable();
         document.add(table);
         
         table = createTable2();
         document.add(table);
         
         table = createTable3();
         document.add(table);
         
         table = createTable4();
         document.add(table);
         
         table = createTable5();
         document.add(table);
         
         table = createTable6();
         document.add(table);
         
         table = createTable7();
         document.add(table);
         
         table = createTable8();
         document.add(table);
         
         table = createTable9();
         document.add(table);
         
       
         table = createTable11();
         document.add(table);
         
         table = createTable12();
         document.add(table);
         
         document.close();
		 
		return null;
	}
	
	public static PdfPTable createTable1() throws DocumentException {

	   	 PdfPTable table = new PdfPTable(5);
	   	 table.setWidths(new int[]{ 1, 1,1,1,1 });
	        table.setWidthPercentage(10);
	        table.setSpacingBefore(5);
	        table.setSpacingAfter(10);
	        
	        PdfPCell cell;
	    	
	       
	        cell = new PdfPCell();
	       

	        /*-----------------------------------------ROW 1-------------------------------------------*/
	       
	        // row 1, cell 1
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 2
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 3
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 4
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 5
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        return table ;
		} 

	public static PdfPTable imageTable() throws DocumentException, MalformedURLException, IOException {
        PdfPTable table = new PdfPTable(2); 
        table.setWidths(new int[]{ 5, 5});
        
       

        Image image = Image.getInstance("D:\\exaple project\\payslip\\src\\main\\resources\\images\\seawaves.png");
        PdfPCell cell = new PdfPCell(image, true);
        cell.setBorder(Rectangle.NO_BORDER);
        table.addCell(cell);
       
        cell = new PdfPCell(new Phrase(""));
        cell.setBorder(Rectangle.NO_BORDER);
        table.addCell(cell);
        
        // row 1, cell 2
        cell = new PdfPCell(new Phrase(""));
        cell.setBorder(Rectangle.NO_BORDER);
        table.addCell(cell);
        
        // row 1, cell 3
        cell = new PdfPCell(new Phrase(""));
        cell.setBorder(Rectangle.NO_BORDER);
        table.addCell(cell);
        
        // row 1, cell 4
        cell = new PdfPCell(new Phrase(""));
        cell.setBorder(Rectangle.NO_BORDER);
        table.addCell(cell);
        
        // row 1, cell 5
        cell = new PdfPCell(new Phrase(""));
        cell.setBorder(Rectangle.NO_BORDER);
        table.addCell(cell);
        return table ;   

        
}

	public static PdfPTable createTable2() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(4);
	   	 table.setWidths(new int[]{ 1, 1,1,1 });
	        table.setWidthPercentage(80);
	        table.setSpacingAfter(10);
	        
	        PdfPCell cell;
	    	
	        
	        cell = new PdfPCell();
	        
	        
	 /*-----------------------------------------ROW 1-------------------------------------------*/
	        
	        // row 1, cell 1
	        cell = new PdfPCell(new Phrase(""));
           cell.setBorder(Rectangle.NO_BORDER);
           table.addCell(cell);
           
           // row 1, cell 2
           cell = new PdfPCell(new Phrase(""));
           cell.setBorder(Rectangle.NO_BORDER);
           table.addCell(cell);
           
           // row 1, cell 3
           cell = new PdfPCell(new Phrase(""));
           cell.setBorder(Rectangle.NO_BORDER);
           table.addCell(cell);
           
           // row 1, cell 4
           cell = new PdfPCell(new Phrase(""));
           cell.setBorder(Rectangle.NO_BORDER);
           table.addCell(cell);
           
           // row 1, cell 5
           cell = new PdfPCell(new Phrase(""));
           cell.setBorder(Rectangle.NO_BORDER);
           table.addCell(cell);
	        
	        return table ;
	   
	    }

	public static PdfPTable createTable3() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(4);
	   	 table.setWidths(new int[]{ 1, 1,1,1 });
	        table.setWidthPercentage(80);
	        table.setSpacingAfter(20);
	        
	        PdfPCell cell;
	    	
	        
	        cell = new PdfPCell();
	        
	        
	 /*-----------------------------------------ROW 1-------------------------------------------*/
	        
	        // row 1, cell 1
	       cell = new PdfPCell(new Phrase(""));
          cell.setBorder(Rectangle.NO_BORDER);
	       table.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
		    table.addCell(cell);
		        
		     cell = new PdfPCell(new Phrase(""));
		     cell.setBorder(Rectangle.NO_BORDER);
			 table.addCell(cell);
			 
			 cell = new PdfPCell(new Phrase(""));
	         cell.setBorder(Rectangle.NO_BORDER);
		     table.addCell(cell);
		     
		     cell = new PdfPCell(new Phrase(""));
	         cell.setBorder(Rectangle.NO_BORDER);
		     table.addCell(cell);
	        
	        return table ;
	   
	    }

	public static PdfPTable createTable4() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(4);
	   	 table.setWidths(new int[]{ 1, 1,1,1 });
	        table.setWidthPercentage(75);
	        table.setSpacingBefore(15);
	        table.setSpacingAfter(5);
	        
	        PdfPCell cell;
	    	
	        
	        cell = new PdfPCell();
	        
	        
	 /*-----------------------------------------ROW 1-------------------------------------------*/
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
		    table.addCell(cell); 
	        // row 1, cell 1
	        cell = new PdfPCell(new Phrase(format + " " + month.toUpperCase() + " " + year  ,boldFont));
	        cell.setColspan(4);
	        cell.setBorder(Rectangle.NO_BORDER);
	        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	        table.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
		    table.addCell(cell); 
		    
		    cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
		    table.addCell(cell); 
	        
	        return table ;
	   
	    }
 
	public static PdfPTable createTable5() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(5);
	   	 table.setWidths(new int[]{ 2, 2,2,2,2});
	        table.setWidthPercentage(80);
	        table.setSpacingBefore(20);
	        table.setSpacingAfter(10);
	        PdfPCell cell;
	    	
	       
	        cell = new PdfPCell();
	      
	      
	        /*-----------------------------------------ROW 1-------------------------------------------*/
	        // row 1, cell 1
	        cell = new PdfPCell(new Phrase("Emp ID",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 2
	        cell = new PdfPCell(new Phrase(empid));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 3
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 4
	        cell = new PdfPCell(new Phrase("Payable Days",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 5
	        cell = new PdfPCell(new Phrase(String.valueOf(payabledays)));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        
	        /*------------------------------------------ROW 2----------------------------------------------*/
	        
	        // row 2, cell 1
	        cell = new PdfPCell(new Phrase("Emp Name",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
		     // row 2, cell 2
	        cell = new PdfPCell(new Phrase(name));
	        cell.setColspan(2);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 2, cell 3
	       /* cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);  */
	        
	        // row 2, cell 4
	        cell = new PdfPCell(new Phrase("Pan No.",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 2, cell 5
	        cell = new PdfPCell(new Phrase(pan));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        
	        /*------------------------------------------ROW 3--------------------------------------------------*/
	        
		     // row 3, cell 1
	        cell = new PdfPCell(new Phrase("Bank Name",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
		     // row 3, cell 2
	        cell = new PdfPCell(new Phrase(bank));
	        cell.setColspan(2);
	        cell.setBorder(Rectangle.NO_BORDER);
	      
	        table.addCell(cell);
	        
	        // row 3, cell 3
	       /* cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell); 
	        */
	        // row 3, cell 4
	        cell = new PdfPCell(new Phrase("Joining Date",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 3, cell 5
	        cell = new PdfPCell(new Phrase(date));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        
	        /*------------------------------------------ROW 4--------------------------------------------------*/
	        
		     // row 4, cell 1
	        cell = new PdfPCell(new Phrase("Bank Account",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
		     // row 4, cell 2
	        cell = new PdfPCell(new Phrase(String.valueOf(acc)));
	        cell.setColspan(2);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 4, cell 3
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell); 
	        
	        // row 4, cell 4
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 4, cell 5
	        /*cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell); */
	        
	        /*------------------------------------------ROW 5--------------------------------------------------*/
	        
		     // row 5, cell 1
	        cell = new PdfPCell(new Phrase("Designation",boldFont));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
		     // row 5, cell 2
	        cell = new PdfPCell(new Phrase(designation));
	        cell.setColspan(2);
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 5, cell 3
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell); 
	        
	        // row 5, cell 4
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 5, cell 5
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	      
	       return table;
	   }

	public static PdfPTable createTable6() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(5);
	   	 table.setWidths(new int[]{ 1, 1,1,1,1 });
	        table.setWidthPercentage(10);
	        table.setSpacingBefore(5);
	        table.setSpacingAfter(20);
	        
	        PdfPCell cell;
	    	
	       
	        cell = new PdfPCell();
	       

	        /*-----------------------------------------ROW 1-------------------------------------------*/
	       
	        // row 1, cell 1
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 2
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 3
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 4
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 5
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        return table ;
		}

	public static PdfPTable createTable7() throws DocumentException {
    	PdfPTable table = new PdfPTable(2);
    	table.setWidths(new int[]{ 1, 1});
        table.setWidthPercentage(70);
        table.setSpacingBefore(5);
        table.setSpacingAfter(5);
        table.setHorizontalAlignment(Element.ALIGN_CENTER);
        
        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        PdfPCell cell;
        cell = new PdfPCell();
        
        /*-----------------------------------------ROW 1-------------------------------------------*/
        
        // row 1, cell 1
        cell = new PdfPCell(new Phrase("Descriptions",boldFont));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        
        // row 1, cell 2
        cell = new PdfPCell(new Phrase("Amount",boldFont));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        
        
        /*------------------------------------------ROW 2----------------------------------------------*/
        
        // row 2, cell 1
        cell = new PdfPCell(new Phrase("Basic Salary"));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell);
        
	     // row 2, cell 2
        cell = new PdfPCell(new Phrase(decimalFormat.format(sal)));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(cell);
        
        // row 2, cell 3
        cell = new PdfPCell(new Phrase("Provident Fund"));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell);
        
        // row 2, cell 4
        cell = new PdfPCell(new Phrase(decimalFormat.format(provident_fund)));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(cell);
        
/*------------------------------------------ROW 3----------------------------------------------*/
        
      // row 3, cell 1
        cell = new PdfPCell(new Phrase("Special Allowance"));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell);
        
	     // row 3, cell 2
        cell = new PdfPCell(new Phrase(decimalFormat.format(special_allowance)));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(cell);
        
        // row 3, cell 3
       cell = new PdfPCell(new Phrase("Bonus"));
       cell.setBorderColor(BaseColor.LIGHT_GRAY);
       table.addCell(cell);
        
        // row 3, cell 4
        cell = new PdfPCell(new Phrase(decimalFormat.format(bonus)));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(cell);
        
/*------------------------------------------ROW 4----------------------------------------------*/
        
        // row 4, cell 1
        cell = new PdfPCell(new Phrase("Tax Deduction"));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        table.addCell(cell);
        
	     // row 4, cell 2
        cell = new PdfPCell(new Phrase(decimalFormat.format(tax_deduction)));
        cell.setBorderColor(BaseColor.LIGHT_GRAY);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        table.addCell(cell);
        
        
        
      
    	return table;
    }

	public static PdfPTable createTable8() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(2);
	   	 table.setWidths(new int[]{ 1, 1 });
	        table.setWidthPercentage(70);
	        
	        PdfPCell cell;
	    	
	       
	        cell = new PdfPCell();
	        
	 /*-----------------------------------------ROW 1-------------------------------------------*/
	        
	        // row 1, cell 1
	        cell = new PdfPCell(new Phrase("Total",boldFont));
	        cell.setBorderColor(BaseColor.LIGHT_GRAY);
	        table.addCell(cell);
	        
	        // row 1, cell 2
	        cell = new PdfPCell(new Phrase(decimalFormat.format(total),boldFont));
	        cell.setBorderColor(BaseColor.LIGHT_GRAY);
	        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	        table.addCell(cell);
	        
	       return table ;
	    }

	public static PdfPTable createTable9() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(4);
	   	 table.setWidths(new int[]{ 1, 1,1,1 });
	        table.setWidthPercentage(70);
	        table.setSpacingBefore(5);
	        table.setSpacingAfter(230);
	        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
	        PdfPCell cell;
	    	
	        
	        cell = new PdfPCell();
	        
	        
	 /*-----------------------------------------ROW 1-------------------------------------------*/
	        
	        // row 1, cell 1
	        cell = new PdfPCell(new Phrase(new Phrase("Net Salary: " + "Rs. " + decimalFormat1.format(total)  + " ( Rs. "+ word + " Only" +" )",boldFont)));
	        cell.setBorderColor(BaseColor.LIGHT_GRAY);
	        cell.setColspan(4);
	        table.addCell(cell);
	        
	        return table ;
	   
	    }

	public static PdfPTable createTable11() throws DocumentException {
	   	 PdfPTable table = new PdfPTable(5);
	   	 table.setWidths(new int[]{ 1, 1,1,1,1 });
	        table.setWidthPercentage(10);
	      /*  table.setSpacingBefore(5); */
	        table.setSpacingAfter(20);
	        
	        PdfPCell cell;
	    	
	       
	        cell = new PdfPCell();
	       

	        /*-----------------------------------------ROW 1-------------------------------------------*/
	       
	        // row 1, cell 1
	       cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 2
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 3
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 4
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        
	        // row 1, cell 5
	        cell = new PdfPCell(new Phrase(""));
	        cell.setBorder(Rectangle.NO_BORDER);
	        table.addCell(cell);
	        return table ;
		}


	public static PdfPTable createTable12() throws DocumentException, MalformedURLException, IOException {
		PdfPTable table = new PdfPTable(1);
		table.setSpacingBefore(10);
		Image image = Image.getInstance("D:\\exaple project\\payslip\\src\\main\\resources\\images\\seawavesfooter.png");
		table.setWidthPercentage(80);
        PdfPCell cell = new PdfPCell(image, true);
        cell.setBorder(Rectangle.NO_BORDER);
        table.addCell(cell);
		
		return table;
}



}
