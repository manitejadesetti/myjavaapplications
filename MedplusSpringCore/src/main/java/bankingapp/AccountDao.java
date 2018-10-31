package bankingapp;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface AccountDao {
	public int accnoGenerate();
	public int checkAccountno(int accno);
    public int createAccount(Account acc);
    public int Balance(int accno);
    public int updateBalance(double balance,int accno);
}
