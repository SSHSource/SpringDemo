package com.superxu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.superxu.service.InjectionService;

public class TestInjection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ApplicationContext beanFactory=new FileSystemXmlApplicationContext("src/xspring.xml");
	/*	Resource resouce = new ClassPathResource("classpath:xspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resouce);*/
		//bean容器初始化
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_inject.xml");
		/*StudentService service = (StudentService) context.getBean("myBean");
		service.showInfo();*/
		InjectionService injectionService = (InjectionService) context.getBean("injectService");
		injectionService.save(" data ");
	}

}
