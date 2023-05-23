package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationController {
		@Autowired
		private IEmployeeMgmtService empservice;
		@GetMapping("/")
		public String ShowHomePage()
		{
			//returen LvN logical view name
			return "welcome";
		}
		@GetMapping("/emp_report")
		public String showEmployee(Map<String,Object>map) {
			//use Service
			List<Employee> list=empservice.findAllEmployee();
			//add to the model attribute
			map.put("empsData",list);
			//return LVN Logicl view name
			return "show_report";
		}
		@GetMapping("/emp_add")
		public String showAddEmployeeFormPage(@ModelAttribute("emp") Employee emp) {
			
			//return LVN
			return "emplouee_register_form";
		}
		@PostMapping("/emp_add")
		public String procssAddEmployeeFormPageSubmission(Map<String,Object>map,
															@ModelAttribute("emp")Employee emp) {
			//use service
			String msg=empservice.registerEmployee(emp);
			List<Employee> list=empservice.findAllEmployee();
			//keep the result in model attribute
			map.put("resultMsg",msg);
			map.put("empsData",list);
			//return LVN
			return "show_report";
			
		}
		
		@GetMapping("/emp_edit")
		public String showEditEmployeeFormPage(@RequestParam("no")int no,
												@ModelAttribute("emp")Employee emp) {
			//use Service
			Employee emp1=empservice.findEmployeeByNo(no);
			BeanUtils.copyProperties(emp1,emp);
			//return edit form LvN
			return "employee_edit_form";
			
		}
		@PostMapping("/emp_edit")
		public String processEditFormPageSubmission(@ModelAttribute("emp") Employee emp,
													Map<String,Object> map) {
			//use service
			String msg=empservice.modifyEmployeeDetailsByNo(emp);
			List<Employee> listEmps=empservice.findAllEmployee();
			//keep results in model attributes
			map.put("resultMsg",msg);
			map.put("empsData",listEmps);
			//return LVN
			return "show_report";
		}
		@GetMapping("/emp_delete")
		public String removeEmployee(@RequestParam("no")int no,Map<String,Object> map)
		{
			//use service
			String msg=empservice.removeEmployeeByno(no);
			List<Employee> list=empservice.findAllEmployee();
			map.put("resultMsg",msg);
			map.put("empsData",list);
			return "show_report";
		}
}
