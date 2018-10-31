package com.medplus.employee.dao.impl;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.medplus.employee.bean.Employee;
import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.utils.DBQueries;
import com.medplus.employee.utils.DateParsing;
import com.mysql.jdbc.Driver;


public class EmployeeDaoImpl implements EmployeeDao{
	
	Connection conn = null;
	PreparedStatement pst;
	ResultSet rs;
	@Override
	public int addEmployee(Employee employee) {
		int rows = 0;
		OpenDBConnection();
		 
		try {
			pst = conn.prepareStatement(DBQueries.addempl);
			
			pst.setInt(1, employee.getEmpcode());
			pst.setString(2, employee.getEmpname());
			pst.setString(3, employee.getJob());
			pst.setInt(4, employee.getSalary());
			pst.setDate(5, DateParsing.utilDateToSQLDateConversion(employee.getDateOfBirth()));
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		
		return rows;
	}
	
	@Override
	public int updateEmployee(Employee employee) {
		int rows = 0;
		OpenDBConnection();
		 
		try {
			pst = conn.prepareStatement(DBQueries.updateEmpl);
			
			pst.setString(1, employee.getEmpname());
			pst.setString(2, employee.getJob());
			pst.setInt(3, employee.getSalary());
			pst.setDate(4, DateParsing.utilDateToSQLDateConversion(employee.getDateOfBirth()));
			pst.setInt(5, employee.getEmpcode());
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		
		return rows;
	}
	
	@Override
	public int deleteEmployee(int code) {
		int rows = 0;
		OpenDBConnection();
		 
		try {
			pst = conn.prepareStatement(DBQueries.deleteEmpl);
			pst.setInt(1, code);
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		
		return rows;
	}
	
	@Override
	public List<Employee> getEmployees() {
		
		OpenDBConnection();
		ArrayList<Employee> empList = new ArrayList<>();
		try {
			pst = conn.prepareStatement(DBQueries.getEmployees);
		
		    rs=pst.executeQuery();
	        while(rs.next()) {
	        	Employee employee=new Employee();
	        	employee.setEmpcode(rs.getInt(1));
	        	employee.setEmpname(rs.getString(2));
	        	employee.setJob(rs.getString(3));
	        	employee.setSalary(rs.getInt(4));
	        	employee.setDateOfBirth(rs.getDate(5));
	        	empList.add(employee);
	        	
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		
		return empList;
	}
	
	@Override
	public Employee getEmployeeByID(Employee employee1) {
		
		OpenDBConnection();
		Employee employee = null;
		try {
			pst = conn.prepareStatement(DBQueries.getEmployeeByID);
		    pst.setInt(1, employee1.getEmpcode());
		    rs=pst.executeQuery();
	        while(rs.next()) {
	        	employee=new Employee();
	        	employee.setEmpcode(rs.getInt(1));
	        	employee.setEmpname(rs.getString(2));
	        	employee.setJob(rs.getString(3));
	        	employee.setSalary(rs.getInt(4));
	        	employee.setDateOfBirth(rs.getDate(5));
	        	
	        	
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		
		return employee;
	}
	
	
	@Override
	public void OpenDBConnection() {
		
		String url = "jdbc:mysql://localhost:3306/CustomFurnish";
		String user= "root";
		String pass= "root";
		try {
			Driver driver = new Driver();
			conn= DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	@Override
	public void closeConnection() {
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	

	
	
	
	

}
