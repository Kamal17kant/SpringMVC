package com.kamal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.kamal.entity.Employee;

@Repository("empDAO")
public class EmployeeDAOImpli implements IEmployeeDAO{
	@Autowired
	 private HibernateTemplate ht;
	@Override
	public int insert(Employee emp) {
		// TODO Auto-generated method stub
		ht.setCheckWriteOperations(false);
		int idval=(int)ht.save(emp);
		return idval;
	}
	@Override
	public Employee getEmployeeByid(int id) {
		// TODO Auto-generated method stub
		Employee emp=ht.get(Employee.class,id);
		return emp;
	}

}
