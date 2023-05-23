package com.kamal.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EMPLOYEE_TAB")
@Data
public class Employee {
	@Id
	@Column(name="ENO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eno;
	@Column(name="ENAME",length=20)
	private String ename;
	@Column(name="EADDRS",length=30)
	private String adrs;
	@Column(name="SAL")
	private Float sal;
}
