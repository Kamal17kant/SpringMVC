package com.kamal.dao;

import com.kamal.entity.Employee;

public interface IEmployeeDAO {
	public int insert(Employee emp);
	public Employee getEmployeeByid(int id);
}
