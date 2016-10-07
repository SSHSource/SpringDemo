package com.superxu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.superxu.autowiring.AutowiringService;

public class TestAutoWiring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//bean容器初始化
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("classpath:spring_autowiring.xml");
		AutowiringService autoWiringService = (AutowiringService) context.getBean("autowiringService");
		autoWiringService.say(" data ");
	}

}
