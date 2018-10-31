package sample;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empcode;
	private String empname;
	private String job;
	private int salary;
	private String dateOfBirth;
	public Employee(int empcode, String empname, String job, int salary, String dateOfBirth) {
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", empname=" + empname + ", job=" + job + ", salary=" + salary
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	

}
