package com.medplus.employee.service;

import java.util.List;

import com.medplus.employee.bean.Employee;

public interface UserService {
	public List<Employee> getEmployees();
	public Employee getEmployeeByID(int employee);

}
