package com.kamal.service;

import com.kamal.entity.Employee;

public interface IEmployeeService {

	public String regiaterEmployee(Employee emp);
	public Employee findEmployeeByid(int id);
}
