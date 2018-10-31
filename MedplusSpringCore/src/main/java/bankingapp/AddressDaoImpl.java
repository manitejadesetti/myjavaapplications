package bankingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDaoImpl extends JdbcDaoSupport implements AddressDao {

   @Autowired
	public AddressDaoImpl(DriverManagerDataSource dataSource) {
		setDataSource(dataSource);
	}
	@Override
	public int insertAddress(Address add) {
		int rows=0;
		String sql="insert into Address values(?,?,?)";
		Object[] args= {add.getAccno(),add.getStreet(),add.getCity()};
		rows=getJdbcTemplate().update(sql, args);
		return rows;
		
	}

}
