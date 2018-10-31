package com.medplus.employee.bean;

import java.util.Date;

public class Employee {
	private int empcode;
	private String empname;
	private String job;
	private int salary;
	private Date dateOfBirth;
	public Employee(int empcode, String empname, String job, int salary, Date dateOfBirth) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.job = job;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}
	public int getEmpcode() {
		return empcode;
	}
	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", job=" + job + ", salary=" + salary
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	public Employee() {
		super();
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
