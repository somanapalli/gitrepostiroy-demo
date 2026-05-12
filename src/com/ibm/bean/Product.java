package com.ibm.bean;

import org.springframework.stereotype.Component;

@Component
public class Product {

	
	private Integer productId;
	private String productName;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String toString()
	{
		return productId+" "+productName;
	}
	
	public Product()
	{
		
	}
	
	public Product(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
}
