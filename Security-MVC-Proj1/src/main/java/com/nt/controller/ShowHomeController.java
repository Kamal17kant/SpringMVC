package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishService;

@Controller
public class ShowHomeController {
	
	@Autowired
	private IWishService service;
	@RequestMapping("/")
	public String showHomePage() {//HAndeler Method
		
		return "Welcome";
	}
	@RequestMapping("/wish")
	public String showWishMsg(Map<String,Object> map) {
		String msg=service.generateWishMessage();
		System.out.println(msg);
		map.put("wmsg",msg);
		return "show-result";
		
	}
	
	@GetMapping("/contact")
	public String showContactUsPage() {
		return "contact-us";
	}
}
