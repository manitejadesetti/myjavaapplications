package bankingapp;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface TransactionDao {

	public int addTransaction(Transaction tr);
	public List<Transaction> viewTransactions(int accno);
}
