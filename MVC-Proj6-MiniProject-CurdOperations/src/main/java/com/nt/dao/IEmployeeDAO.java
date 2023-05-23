package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {

	public List<Employee> getAllEmployee();
	public int registerEmployee(Employee emp);
	public Employee getEmployeeByNo(int n);
	public int updateEmployeeByNo(Employee emp); 
	public int deleteEmployrrByNo(int no);
}
