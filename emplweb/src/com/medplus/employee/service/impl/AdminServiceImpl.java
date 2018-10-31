package com.medplus.employee.service.impl;

import java.util.List;

import com.medplus.employee.bean.Employee;
import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.dao.impl.EmployeeDaoImpl;
import com.medplus.employee.service.AdminService;

public class AdminServiceImpl implements AdminService {
    
	EmployeeDao dao = new EmployeeDaoImpl();
	@Override
	public int addEmployee(Employee employee) {
		int rows=0;
		rows= dao.addEmployee(employee);
		return rows;
	}

	@Override
	public int updateEmployee(Employee employee) {
		int rows=0;
		rows=dao.updateEmployee(employee);
		return rows;
	}

	@Override
	public int deleteEmployee(int employee) {
		int rows = dao.deleteEmployee(employee);
		return rows;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> empList = dao.getEmployees();
		return empList;
	}

	@Override
	public Employee getEmployeeByID(int employee) {
		Employee emp=dao.getEmployeeByID(employee);
		return emp;
	}

}
