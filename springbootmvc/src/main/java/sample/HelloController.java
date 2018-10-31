package sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
   ModelAndView mav;
   String message;
   @RequestMapping(value="/login", method=RequestMethod.GET)
   public ModelAndView loginPage() {
	   mav=new ModelAndView();
	   mav.setViewName("Login");
	   return mav;
   }
   @RequestMapping(value="/login", method=RequestMethod.POST)
   public ModelAndView login() {
	   mav=new ModelAndView();
	   mav.setViewName("redirect:/welcome");
	   return mav;
   }
   @RequestMapping("/welcome")
   public ModelAndView welcome() {
	   mav=new ModelAndView();
	   message="Welcome to spring Boot MVC";
	   mav.addObject("msg", message);
	   mav.setViewName("Welcome");
	   return mav;
   }
}
