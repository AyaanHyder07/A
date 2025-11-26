package com.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.serviceImpl.*;
@Configuration
public class SpringConfig {
	@Bean("CustomerService")
	public CustomerServiceImpl CustomerServiceImpl() {
		return new CustomerServiceImpl();
	}
	

}