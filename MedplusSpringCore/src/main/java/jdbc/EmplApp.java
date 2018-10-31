package jdbc;

import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmplApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Annotations.xml");
		
		EmployeeDao dao= ctx.getBean("employeeDao",EmployeeDao.class);
        Employee empl= ctx.getBean("employee", Employee.class);
        //empl.setEmpcode(403);
       /* empl.setEmpname("varun");
        empl.setJob("Devops");
        empl.setSalary(6000);
        empl.setDateOfBirth(DateParsing.convertStringToUtilDate("2018-09-09"));*/
       // int r = dao.deleteEmpl();
       // System.out.println("updated "+r);
        
        List<Employee> Empls= dao.getEmpls();
        for (Employee employee : Empls) {
        	System.out.println(employee.getEmpcode()+employee.getEmpname());
		}
        
       empl = dao.getEmp(100);
       System.out.println(empl.getEmpcode()+empl.getJob());
        
	}

}
