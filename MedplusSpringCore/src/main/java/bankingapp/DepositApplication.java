package bankingapp;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepositApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Annotations.xml");
		Scanner sc = new Scanner(System.in);
		AccountDao dao= ctx.getBean("accountDaoImpl",AccountDaoImpl.class);
		Transaction tr= ctx.getBean("transaction",Transaction.class);
		TransactionDao dao1= ctx.getBean("transactionDaoImpl",TransactionDaoImpl.class);
		System.out.println("Enter Account number");
		int accountno=sc.nextInt();
		double amount;
		double balance;
		int rows1=0;
		int rows2=0;
		int rows=dao.checkAccountno(accountno);
		if(rows>0)
		{
			System.out.println("Enter amount to deposit");
			amount=sc.nextDouble();
			tr.setAccno(accountno);
			tr.setDateOfTransaction(new Date());
			tr.setTranstype("Deposit");
			tr.setDescription(null);
			tr.setAmount(amount);
			balance=dao.Balance(accountno);
			balance=balance+amount;
			tr.setBalance(balance);
			rows1=dao1.addTransaction(tr);
			rows2=dao.updateBalance(balance,accountno);	
			
			if(rows1>0&& rows2>0) 
				System.out.println("inserted");
			else
				System.out.println("not Inserted");
			
		 }
		else
			System.out.println("Account no not found");
			
			
		}
		
	}
