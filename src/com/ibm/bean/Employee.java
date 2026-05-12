package com.ibm.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {

	private Integer empId;
	private String empName;
	
	@Autowired
	private Address address;

	public Address getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
