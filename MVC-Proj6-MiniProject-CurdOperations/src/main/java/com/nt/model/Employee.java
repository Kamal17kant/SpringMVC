package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private Integer empno;
	private String ename;
	private String job;
	public Float sal;
	private Integer deptno;
}
