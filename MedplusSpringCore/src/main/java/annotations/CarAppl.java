package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarAppl {
    public static void main(String[] args) {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("Annotations.xml");
    	Car car= ctx.getBean("car",Car.class);
    	car.moving("BedRock");
    }
}
