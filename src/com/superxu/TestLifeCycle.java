package com.superxu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.superxu.lifecycle.BeanLifeCycle;

public class TestLifeCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ApplicationContext beanFactory=new FileSystemXmlApplicationContext("src/xspring.xml");
	/*	Resource resouce = new ClassPathResource("xspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resouce);*/
		//bean容器初始化
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_lifecycle.xml");
		/*StudentService service = (StudentService) context.getBean("myBean");
		service.showInfo();*/
		context.start();
		BeanLifeCycle beanLifeCycle = (BeanLifeCycle) context.getBean("beanLifeCycle");
		context.destroy();
	}

}
