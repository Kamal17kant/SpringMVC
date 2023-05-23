package kamal.kt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kamal.kt.model.User;

@Controller
public class ContectController {
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header","we dont share your privacy");
	}
	@RequestMapping("/contact")
	public String showForms() {
		return "contact";
	}
	@RequestMapping(path = "/processform",method=RequestMethod.POST)
	public String handlerForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		return "success";
	}
}

/*for seting single single data we will use this*/
//@RequestMapping(path = "/processform",method=RequestMethod.POST)
//public String handlerForm(@RequestParam("email") String userEmail,
//						  @RequestParam("username") String userName,
//						  @RequestParam("password") String password
//						  ,Model model) {
//	User user=new User();
//	user.setEmail(userEmail);
//	user.setUsername(userName);
//	user.setPassword(password);
//	System.out.println(user);
//	
////	model.addAttribute("name",userName);
////	model.addAttribute("email",userEmail);
////	model.addAttribute("pwd",password);
//	model.addAttribute("user",user);
//	return "success";
//}
