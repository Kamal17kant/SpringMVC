package com.kamal.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kamal.entity.Employee;
import com.kamal.service.IEmployeeService;

public class OrmTest {
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/kamal/cfgs/applicationContext.xml");
	//Getting service class object reference
	IEmployeeService service=ctx.getBean("empService",IEmployeeService.class);
	//invoke the b.method
	Employee emp=new Employee();
	
	emp.setEname("Kamal Kant");emp.setSal(67897.0f);
	emp.setAdrs("Gaya");
	String msg=service.regiaterEmployee(emp);
	System.out.println("+++++++++++++++++++++++++++++++++");
	Employee findemp=service.findEmployeeByid(1);
	System.out.println("Employee details are"+findemp);
}
}
