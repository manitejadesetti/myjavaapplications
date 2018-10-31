package jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.xerces.internal.impl.validation.ValidationState;

import jdbc.EmployeeDao;

//import jdbc.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	Employee employee;
	String msg;
	@Autowired
	EmployeeDao dao;
	
	
	@RequestMapping(value="/home")
	public String homePage() {
		return "Home";
	}
	
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
		int rows =dao.addEmpl(emp);
		if(rows>0) {
			msg =rows+ " record(s) inserted";
			mav.addObject("msg", msg);
			mav.setViewName("Welcome");
		}
		return mav;
		
	}
	
	@RequestMapping(value="/viewempls")
	public ModelAndView employeeList() {
		ModelAndView mav = new ModelAndView();
		List<Employee> empList = dao.getEmpls();
		mav.addObject("List",empList);
		mav.setViewName("ViewEmpls");
		return mav;
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public ModelAndView updateEmpl(@RequestParam("code") int code) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("employee", dao.getEmp(code));
		mav.setViewName("UpdateEmpl");
		return mav;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView updatedList(@ModelAttribute("employee") Employee emp) {
		ModelAndView mav = new ModelAndView();
		int rows = dao.updateEmpl(emp);
		if(rows>0) {
			List<Employee> empList = dao.getEmpls();
		    mav.addObject("List",empList);
		    mav.setViewName("redirect:viewempls");
		}
		return mav;
	}
	@RequestMapping(value="/delete")
	public ModelAndView DeleteEmpl(@RequestParam("code") int code) {
		ModelAndView mav = new ModelAndView();
		int rows = dao.deleteEmpl(code);
		if(rows>0) {
			List<Employee> empList = dao.getEmpls();
		    mav.addObject("List",empList);
		    mav.setViewName("redirect:viewempls");
		}
		return mav;
	}
}