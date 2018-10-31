package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
/*	@Autowired
    @Qualifier("mrf")
	Wheels wheels;

	public Wheels getWheels() {
		return wheels;
	}

	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}*/
    public void moving(String wheelType) {
    	Wheels wh = (str)->{
    		System.out.println(str+" ceat wheels are rotating");
    	};
    	wh.rotate(wheelType);
    	wh.material();
    	System.out.println("car is moving");
    }
}
