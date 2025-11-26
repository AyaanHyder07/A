package com.infy.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public EmployeeRepositoryImpl employeeRepository() {
        return new EmployeeRepositoryImpl();
    }

    @Bean
    public EmployeeServiceImpl employeeService() {
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        service.setEmployeeDAO(employeeRepository());
        return service;
    }
}
