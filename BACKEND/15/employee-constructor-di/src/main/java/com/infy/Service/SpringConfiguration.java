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
        return new EmployeeServiceImpl(employeeRepository());
    }
}
