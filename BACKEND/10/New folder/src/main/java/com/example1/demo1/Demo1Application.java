package com.example1.demo1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.SpringConfig;
import com.service.CustomerService;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		AbstractApplicationContext context=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		CustomerService service = (CustomerService) context.getBean("CustomerService");
		System.out.println(service.CreateCustomer());
		context.close();
	}

}
