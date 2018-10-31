package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
  @RequestMapping("/hello")
  public String welcome() {
	  return "Welcome";
  }
  @RequestMapping("/loginPage")
  public String showLoginPage() {
	  return "Login";
  }
  @RequestMapping("/loginvalidate")
  public String validate(@RequestParam("username") String user, @RequestParam("password") String password) {
     if(user.equals("admin")&&password.equals("admin"))
    	 return "Welcome";
     else 
    	 return "Failed";
  }
}
