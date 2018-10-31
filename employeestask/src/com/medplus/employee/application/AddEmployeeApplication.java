package com.medplus.employee.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.medplus.employee.bean.Employee;
import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.dao.impl.EmployeeDaoImpl;
import com.medplus.employee.utils.DateParsing;

public class AddEmployeeApplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		int rows=0;
		boolean flag=false;
		Employee emp = new Employee();
		EmployeeDao dao = new EmployeeDaoImpl();
		while(!flag) {
			System.out.println("Enter 1-insert 2-update 3-delete 4-view 5-viewByID");
			option=sc.nextInt();
			switch(option) {
			
			case 1:
					System.out.println("enter empcode, name, job, salary and date of birth");
					emp.setEmpcode(sc.nextInt());
					emp.setEmpname(sc.next());
					emp.setJob(sc.next());
					emp.setSalary(sc.nextInt());
					emp.setDateOfBirth(DateParsing.convertStringToUtilDate(sc.next()));
					rows = dao.addEmployee(emp);
					if(rows>0)
					   System.out.println("Inserted");
					else 
						System.out.println("not inserted");
					break;
			case 2 :
					System.out.println("enter name, job, salary, date of birth and empcode to update table");
					emp.setEmpname(sc.next());
					emp.setJob(sc.next());
					emp.setSalary(sc.nextInt());
					emp.setDateOfBirth(DateParsing.convertStringToUtilDate(sc.next()));
					emp.setEmpcode(sc.nextInt());
					rows = dao.updateEmployee(emp);
					if(rows>0)
					   System.out.println("updated");
					else 
						System.out.println("not updated");
					break;
			case 3 :
					System.out.println("enter empcode to delete the employee from list");
					rows = dao.deleteEmployee(sc.nextInt());
					if(rows>0)
					   System.out.println("deleted");
					else 
					   System.out.println("not deleted");
					break;
			case 4 :
				    List<Employee> ListofEmployees= new ArrayList<>();
				    ListofEmployees=dao.getEmployees();
				    for (Employee employee : ListofEmployees) {
						System.out.println(employee.toString());
					}
				    break;
			case 5 :
				System.out.println("enter empcode to get the employee from list");
				emp.setEmpcode(sc.nextInt());
				Employee employeeByID = dao.getEmployeeByID(emp);
				if(employeeByID!= null)
				    System.out.println(employeeByID.toString());
				else 
					System.out.println("ID not found");
				break;
			default :
				   System.out.println("Enter correct option");
				   break;
			
			}
				
	    }
	}
	

}
