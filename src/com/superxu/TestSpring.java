package com.superxu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ApplicationContext beanFactory=new FileSystemXmlApplicationContext("src/xspring.xml");
		Resource resouce = new ClassPathResource("xspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resouce);
		StudentService service = beanFactory.getBean("myBean",StudentService.class);
		service.showInfo();
	}

}
