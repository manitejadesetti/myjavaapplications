package sample;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class UpdatePSS implements PreparedStatementSetter {
	@Autowired
	Employee emp;
	public UpdatePSS() {
	
	}
	public UpdatePSS(Employee emp) {
		super();
		this.emp = emp;
	}



	@Override
	public void setValues(PreparedStatement pst) throws SQLException {
		pst.setInt(5,emp.getEmpcode());
		pst.setString(1, emp.getEmpname());
		pst.setString(2, emp.getJob());
		pst.setInt(3, emp.getSalary());
		pst.setDate(4, DateParsing.convertStringToUtilDate((emp.getDateOfBirth())));
		
	}
	
	
	
	
}
