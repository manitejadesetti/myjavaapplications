package bankingapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	int num=0;
	@Autowired
	public AccountDaoImpl(DriverManagerDataSource dataSource) {
		setDataSource(dataSource);
	}
	@Override
	public int createAccount(Account acc) {
		int rows=0;
		String sql="insert into Account values(?,?,?,?)";
		Object[] args= {acc.getAccno(),acc.getCustomerName(),acc.getBalance(),acc.getDoc()};
		rows=getJdbcTemplate().update(sql, args);
		return rows;
	}

	@Override
	public int updateBalance(double balance,int accno) {
		int rows=0;
		String sql="update Account set balance=? where accno=?";
		Object[] args= {balance,accno};
		rows=getJdbcTemplate().update(sql, args);
		return rows;
	}

	@Override
	public int accnoGenerate() {
		String sql="select max(accno) from Account";
		Integer rows;
		rows=getJdbcTemplate().queryForObject(sql, null,Integer.class);
		if(rows==null)
			num=10000;
		else
			num=++rows;
		
		return num;
		
		
	}
	@Override
	public int checkAccountno(int accno) {
		int rows=0;
		String sql="select count(*) from Account where accno=?";
		Object[] args = {accno};
		rows=getJdbcTemplate().queryForObject(sql, args,Integer.class);		
	    return rows;
	}
	@Override
	public int Balance(int accno) {
		int rows=0;
		String sql = "select balance from Account where accno=?";
		Object[] args = {accno};
		rows=getJdbcTemplate().queryForObject(sql, args,Integer.class);		
	    return rows;
	}
      
}
