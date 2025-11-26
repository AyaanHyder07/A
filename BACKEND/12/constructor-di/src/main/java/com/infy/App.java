package com.infy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import com.infy.configuration.SpringConfiguration;
import com.infy.service.CustomerServiceImpl;

public class App {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        CustomerServiceImpl service =
                (CustomerServiceImpl) context.getBean("customerService");

        System.out.println(service.fetchCustomer());

        context.close();
    }
}
