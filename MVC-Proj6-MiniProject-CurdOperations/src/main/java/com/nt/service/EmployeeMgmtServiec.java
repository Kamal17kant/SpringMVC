package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiec implements IEmployeeMgmtService{
	@Autowired
	private IEmployeeDAO empDAO;
	@Override
	public List<Employee> findAllEmployee() {
		// Use DAO
		List<Employee> list=empDAO.getAllEmployee();
		return list;
	}
	@Override
	public String registerEmployee(Employee emp) {
		//use DAO
		int count=empDAO.registerEmployee(emp);
		return count==0?"Employee not Register":"Employee is registered";
	}
	@Override
	public Employee findEmployeeByNo(int no) {
		// Use DAO
		Employee emp=empDAO.getEmployeeByNo(no);
		return emp;
	}
	@Override
	public String modifyEmployeeDetailsByNo(Employee emp) {
		// use DAO
		int count=empDAO.updateEmployeeByNo(emp);
		return count==0?"Employee not found for updation":"Employee Fond and Updated";
	}
	@Override
	public String removeEmployeeByno(int no) {
		//Using DAO
		int count=empDAO.deleteEmployrrByNo(no);
		return count==0?"Employee not found fordeletion":"Employeefound and deete";
	}

}
