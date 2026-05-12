package com.ibm.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	
	
	private String cityName;
	
	private String stateName;
	
	
	private String countryName;
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public Address()
	{
		
	}
	
    @Override
    public String toString()
    {
    	return cityName + " " + stateName + " " + countryName;
    }
	/*
	 * public Address(String cityName, String stateName, String countryName) {
	 * super(); this.cityName = cityName; this.stateName = stateName;
	 * this.countryName = countryName; }
	 */
    
    

}
