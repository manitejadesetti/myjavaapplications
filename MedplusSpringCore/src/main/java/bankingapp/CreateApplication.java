package bankingapp;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Annotations.xml");
		Scanner sc = new Scanner(System.in);
		
		AccountDao dao = ctx.getBean("accountDaoImpl",AccountDaoImpl.class);
		Account acc = ctx.getBean("account",Account.class);
		Address add = ctx.getBean("address",Address.class);
		AddressDao dao1= ctx.getBean("addressDaoImpl",AddressDaoImpl.class);
		int rows=0;
	    int rows1=0;
	    int accnoGenerate = dao.accnoGenerate();
		acc.setAccno(accnoGenerate);
		acc.setCustomerName(sc.next());
		acc.setBalance(sc.nextDouble());
		add.setAccno(accnoGenerate);
		add.setStreet(sc.next());
		add.setCity(sc.next());
		acc.setDoc(new Date());
		acc.setAddress(add);
		rows=dao.createAccount(acc);
		rows1=dao1.insertAddress(add);
		if(rows>0)
			System.out.println("Inserted");
		else
			System.out.println("not Inserted");
		
	}

}
