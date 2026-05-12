package com.ibm.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.config.AppConfig;

public class Test {
	
	public static void main(String[] args) {
		
		
		/*ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationcontext.xml");

		
		 * Employee employee1 = context.getBean(Employee.class);
		 * 
		 * Address address1 = employee1.getAddress();
		 * 
		 * address1.setCityName("hyd"); address1.setStateName("Tg");
		 * address1.setCountryName("india"); employee1.setEmpId(100);
		 * employee1.setEmpName("rk"); employee1.setAddress(address1);
		 * 
		 * Employee employee2 = context.getBean(Employee.class);
		 * employee2.setEmpId(200); employee2.setEmpName("preethi"); Address address2 =
		 * employee2.getAddress();
		 * 
		 * address2.setCityName("mumbai"); address2.setStateName("MH");
		 * address2.setCountryName("india"); employee2.setAddress(address2);
		 * 
		 * //System.out.println(employee1 == employee2);
		 * 
		 * System.out.println(employee1.getEmpName() + " " + employee1.getAddress());
		 * System.out.println(employee2.getEmpName() + " " + employee2.getAddress());
		 */
		
		ApplicationContext context 
		= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Product product = context.getBean(Product.class);
		product.setProductId(100);
		product.setProductName("laptop");
		
		System.out.println(product);
	
	}

}
