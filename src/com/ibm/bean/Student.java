package com.ibm.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("101")
	private Integer stid;
	@Value("rk")
	private String stname;
	
	@Autowired
	private Address address;
	

	// business logic class
	public void getStudentInfo() {
		System.out.println("Student id is " + stid);
		System.out.println("Student name is " + stname);
		System.out.println("Student address is " + address);
	}
	
	/*
	 * public Student() {
	 * 
	 * }
	 * 
	 * public Student(Integer stid, String stname, Address address) { super();
	 * this.stid = stid; this.stname = stname; this.address = address; }
	 */

	
	  public Integer getStid() { return stid; }
	  
	  public void setStid(Integer stid) { this.stid = stid; }
	  
	  public String getStname() { return stname; }
	  
	  public void setStname(String stname) { this.stname = stname; }
	  
	  public Address getAddress() { return address; }
	  
	  public void setAddress(Address address) { this.address = address; }
	  
	  
	

}
