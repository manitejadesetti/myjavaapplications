package aop;

import org.springframework.stereotype.Component;

@Component
public class Operation {
    public void msg() {
    	System.out.println("msg method invoked");
    }
    public void k() {
    	System.out.println("k method invoked");
    }
    public void m() {
    	System.out.println("m method invoked");
    }
}
