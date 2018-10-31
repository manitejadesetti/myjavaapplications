package bankingapp;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ViewStatementApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Annotations.xml");	
        TransactionDao dao = ctx.getBean("transactionDaoImpl",TransactionDaoImpl.class);
        AccountDao dao1=ctx.getBean("accountDaoImpl",AccountDaoImpl.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number to view statement");
        int accno=sc.nextInt();
        int rows=dao1.checkAccountno(accno);
        if(rows>0) {
	        List<Transaction> trList =dao.viewTransactions(accno);
	        for (Transaction transaction : trList) {
	        	System.out.println(transaction.getAccno()+" "+transaction.getDateOfTransaction()+" "+transaction.getTranstype()+" "+transaction.getAmount()+" "+transaction.getBalance());
			}
        }
        else 
        	System.out.println("Account no not found");

	}

}
