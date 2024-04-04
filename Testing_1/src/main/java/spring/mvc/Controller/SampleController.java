package spring.mvc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	@RequestMapping(path="/logins")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(path="/Trainee_login")
	public ModelAndView Trainee_login(
			@RequestParam("email") String email,
			@RequestParam("password") String password
			) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Trainee Login Credentials");
		mv.addObject("email",email);
		mv.addObject("password",password);
		mv.setViewName("trainee-login");
		return mv;
	}
	@RequestMapping(path="/Trainee_signup")
	public ModelAndView Trainer_login(
			@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name,
			@RequestParam("dob") String dob,
			@RequestParam("feild_of_study") String feild_of_study,
			@RequestParam("email") String email,
			@RequestParam("password") String password
			) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Trainee signup Credentials");
		mv.addObject("first_name",first_name);
		mv.addObject("last_name",last_name);
		mv.addObject("dob",dob);
		mv.addObject("feild_of_study",feild_of_study);
		mv.addObject("email",email);
		mv.addObject("password",password);
		mv.setViewName("trainee-signup");
		return mv;
	}
}
