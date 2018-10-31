package com.medplus.employee.dao;

import java.util.ArrayList;
import java.util.List;

import com.medplus.employee.bean.Employee;

public interface EmployeeDao {
	
	public int addEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(int employee);
	public List<Employee> getEmployees();
	public Employee getEmployeeByID(int employee);
	public void OpenDBConnection();
	public void closeConnection();

}
;