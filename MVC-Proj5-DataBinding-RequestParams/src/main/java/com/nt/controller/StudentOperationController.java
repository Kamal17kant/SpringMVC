package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationController {
	
/*	@GetMapping("/report")
	public String processRequest(@RequestParam("sno")int sno,@RequestParam("sname") String sname) {
		System.out.println(sno+ " "+ sname);
		return "show_result";
	}*/
	/*@GetMapping("/report")
	public String processRequest(@RequestParam int sno,@RequestParam String sname) {
		System.out.println(sno+ " "+ sname);
		return "show_result";
	}*/
	/*
	@GetMapping("/report")
	public String processRequest(@RequestParam int sno,@RequestParam (required=false) String sname) {
		System.out.println(sno+ " "+ sname);
		return "show_result";
	}*/
	@GetMapping("/report")
	public String processRequest(@RequestParam int sno,@RequestParam(required=false ,defaultValue="kamal") String sname) {
		System.out.println(sno+ " "+ sname);
		return "show_result";
	}
}
