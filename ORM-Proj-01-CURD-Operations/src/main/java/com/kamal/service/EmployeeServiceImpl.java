package com.kamal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kamal.dao.IEmployeeDAO;
import com.kamal.entity.Employee;


@Service("empService")
@Transactional(propagation=Propagation.REQUIRED)
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO empDAO;
	@Override
	public String regiaterEmployee(Employee emp) {
		// TODO Auto-generated method stub
		int idval=empDAO.insert(emp);
		return "Employee saved with the idvalue" +idval;
	}
	@Override
	public Employee findEmployeeByid(int id) {
		// TODO Auto-generated method stub
		Employee emp=empDAO.getEmployeeByid(id);
		return emp;
	}

}
