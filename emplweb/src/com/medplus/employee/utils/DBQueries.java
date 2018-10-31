package com.medplus.employee.utils;

import java.util.ArrayList;

import com.medplus.employee.bean.Employee;

public class DBQueries {
         
	public static String addempl = "insert into employee values(?,?,?,?,?)";
	
	public static String updateEmpl ="update employee set empname=?,job=?,salary=?,dateofbirth=? where empcode=?";
	public static String deleteEmpl ="delete from employee where empcode=?";
	public static String getEmployees="select empcode,empname,job,salary,dateofbirth from employee";
	public static String getEmployeeByID="select empcode,empname,job,salary,dateofbirth from employee where empcode=?";

}
