package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SampleController {
	@RequestMapping(value="/sample",method=RequestMethod.GET)
	public ModelAndView sample() {
		ModelAndView mav = new ModelAndView();
		String msg="Spring mvc";
		mav.addObject("msg", msg);
		mav.setViewName("Welcome");
		return mav;
	}

}
