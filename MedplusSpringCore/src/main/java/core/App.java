package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("Context.xml");
    	Employee emp =ctx.getBean("emp",Employee.class);
    	Student student=ctx.getBean("student",Student.class);
    	Address address =ctx.getBean("address",Address.class);
        System.out.println(emp.getCode()+" "+ emp.getAddress());
        System.out.println(student.getMarks());
        
        System.out.println(address.getCity());
    }
}
