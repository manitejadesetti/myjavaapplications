package bankingapp;

import org.springframework.stereotype.Component;

@Component
public interface AddressDao {
    
	public int insertAddress(Address add);
}
