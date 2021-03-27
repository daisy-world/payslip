package com.fokuswork.payslip.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fokuswork.payslip.Service.PayslipService;
import com.itextpdf.text.DocumentException;

@RestController
public class PayslipController {

	@Autowired
	PayslipService payslipService ;
	
	@GetMapping("/payslip")
	public String getPayslip() throws FileNotFoundException, DocumentException {
		
		System.out.println("start");
		try {
			payslipService.abc();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");

		return null;
	}
	
}
