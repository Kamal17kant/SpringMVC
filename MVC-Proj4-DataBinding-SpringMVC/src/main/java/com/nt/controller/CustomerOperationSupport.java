package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Customer;

@Controller
public class CustomerOperationSupport {
	@GetMapping("/")
	public String showHomePage() {
		//
		return "welcome";
	}
	@GetMapping("/register")
	public String showCustomerFormPage(@ModelAttribute("cust") Customer cust) {
		System.out.println(cust.toString());
		Customer cs=new Customer();
		
		return "cusomer_form";
	}
	
	@PostMapping("/register")
	public String ProcessCustomerSubmition(@ModelAttribute("cust")Customer cust,Map<String,Object>map) {
		String msg=null;
		if(cust.getBillAmt()<10000) 
			msg="Customer is Economy Customer";
		else
			msg="customer is vip";
		map.put("resultMsg", msg);
		map.put("formData", cust);
		return "show_result";
	}
}