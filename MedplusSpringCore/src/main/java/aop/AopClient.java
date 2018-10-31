package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Annotations.xml");
		Operation oper =context.getBean("operation",Operation.class);
        oper.msg();
        oper.k();
        oper.m();
	}

}
