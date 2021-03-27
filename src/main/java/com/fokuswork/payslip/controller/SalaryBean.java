package com.fokuswork.payslip.controller;

public class SalaryBean {
	
	private String empid;
	private String empname;
	private double salary;
	private String month;
	private int year_x;
	private double bonus;
	private double reimburse;
	
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear_x() {
		return year_x;
	}
	public void setYear_x(int year_x) {
		this.year_x = year_x;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getReimburse() {
		return reimburse;
	}
	public void setReimburse(double reimburse) {
		this.reimburse = reimburse;
	}
	
	

}
