package kamal.kt.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjController {
 
	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("name","kamal Kant Prakash");
		model.addAttribute("id",7070);
		List<String> freand=new ArrayList<String>();
			freand.add("kamal");
			freand.add("kant");
			freand.add("prakash");
			model.addAttribute("f",freand);
		return "home";
	}
	@RequestMapping("/about")
	public String aboutPage() {
		System.out.println("This is about page from Controller class");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help page from Controller class");
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("name","Kamal Kant Prakash");
		modelView.addObject("Roll",1234);
		modelView.setViewName("help");
		LocalDateTime now=LocalDateTime.now();
		modelView.addObject("dateTime",now);
		return modelView;
	}
	@RequestMapping("/dbind")
	public ModelAndView binding() {
		System.out.println("This is binding page from Controller class");
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("name","Kamal Kant Prakash");
		modelView.addObject("Roll",1234);
		LocalDateTime now=LocalDateTime.now();
		modelView.addObject("dateTime",now);
		modelView.setViewName("dbind");
		return modelView;
	}
}
