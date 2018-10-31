package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.xerces.internal.impl.validation.ValidationState;

import jdbc.EmployeeDao;

//import jdbc.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
    EmployeeValidations validations;
	@Autowired
	Employee employee;
	String msg;
	@Autowired
	EmployeeDao dao;
	
	
	
	@RequestMapping(value="/addempl",method=RequestMethod.GET)
	public ModelAndView showEmplForm() {
		ModelAndView mav= new ModelAndView();
		mav.addObject(employee);
		mav.setViewName("AddEmployee");
		return mav;
	}
	@RequestMapping(value="/addempl",method=RequestMethod.POST)
	public ModelAndView addEmpl(@ModelAttribute("employee") Employee emp,BindingResult result) {
		ModelAndView mav= new ModelAndView();
		/*validations.validate(emp,result);
		if(result.hasErrors()) {
			mav.setViewName("AddEmployee");
			return mav;
		}
		mav.addObject("employee",emp);
		mav.setViewName("Welcome");
		return mav;*/
		int rows =dao.addEmpl();
		if(rows>0) {
			msg =rows+ " record(s) inserted";
			mav.addObject("msg", msg);
			mav.setViewName("Welcome");
		}
		return mav;
		
	}
}
