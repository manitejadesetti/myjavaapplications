package bankingapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
@Repository
public class TransactionDaoImpl extends JdbcDaoSupport implements TransactionDao {

	@Autowired
	TransactionPSS pss;
	@Autowired
	public TransactionDaoImpl(DriverManagerDataSource dataSource) {
		setDataSource(dataSource);
	}
	@Override
	public int addTransaction(Transaction tr) {
		int rows=0;
		String sql="insert into Transaction values(?,?,?,?,?,?)";
		//Object[] args= {tr.getAccno(),tr.getDateOfTransaction(),tr.getTranstype(),tr.getDescription(),tr.getAmount(),tr.getBalance()};
		rows=getJdbcTemplate().update(sql, pss);
		return rows;
	}

	@Override
	public List<Transaction> viewTransactions(int accno) {
		String sql="select * from Transaction where accno=?";
		Object[] args= {accno};
	    List<Transaction> trList=getJdbcTemplate().query(sql, args, new BeanPropertyRowMapper<Transaction>(Transaction.class));
		
		return trList;
	}

}
