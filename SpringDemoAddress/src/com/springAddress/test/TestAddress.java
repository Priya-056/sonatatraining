package com.springAddress.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springAddress.Address;

public class TestAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("address.xml");
		Address ad=ctx.getBean("address", Address.class);
		System.out.println(ad);
		
		

	}

}
