package cpm.medplus.employee.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.medplus.employee.bean.Employee;
import com.medplus.employee.dao.EmployeeDao;
import com.medplus.employee.dao.impl.EmployeeDaoImpl;

public class EmployeeTest {
	EmployeeDao dao = new EmployeeDaoImpl();
	@Test
	public void testDelete() {
		
		assertEquals(1,dao.deleteEmployee(230));
	}
}
