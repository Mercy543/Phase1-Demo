package com.simplilearn.collection;

public class Employee {

	private int empID;
	private String empNAme;
	private double empSalary;
	private String empDepartment;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpNAme() {
		return empNAme;
	}
	public void setEmpNAme(String empNAme) {
		this.empNAme = empNAme;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public Employee(int empID, String empNAme, double empSalary, String empDepartment) {
		super();
		this.empID = empID;
		this.empNAme = empNAme;
		this.empSalary = empSalary;
		this.empDepartment = empDepartment;
	}
	
	
	public Employee() {};
}
