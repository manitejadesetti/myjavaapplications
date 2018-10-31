package bankingapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;
@Component
public class TransactionPSS implements PreparedStatementSetter{

	@Autowired
	Transaction tr;
	@Override
	public void setValues(PreparedStatement pss) throws SQLException {
		pss.setInt(1, tr.getAccno());
		pss.setDate(2,DateParsing.utilDateToSQLDateConversion(tr.getDateOfTransaction()));
		pss.setString(3, tr.getTranstype());
		pss.setString(4, tr.getDescription());
		pss.setDouble(5,tr.getAmount());
		pss.setDouble(6, tr.getBalance());
		
	}
	
	

}
