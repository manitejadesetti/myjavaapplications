package com.medplus.employee.service;

import java.util.List;

import com.medplus.employee.bean.Employee;

public interface AdminService {
	public int addEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(int employee);
	public List<Employee> getEmployees();
	public Employee getEmployeeByID(int employee);
}
