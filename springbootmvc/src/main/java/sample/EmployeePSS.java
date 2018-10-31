package sample;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;
@Component
public class EmployeePSS implements PreparedStatementSetter {
    @Autowired
	Employee emp;
    
	public EmployeePSS() {
		
	}

	public EmployeePSS(Employee emp) {
		this.emp = emp;
	}

	@Override
	public void setValues(PreparedStatement pst) throws SQLException {
		pst.setInt(1,emp.getEmpcode());
		pst.setString(2, emp.getEmpname());
		pst.setString(3, emp.getJob());
		pst.setInt(4, emp.getSalary());
		pst.setDate(5, DateParsing.convertStringToUtilDate((emp.getDateOfBirth())));	
	}
	

}
