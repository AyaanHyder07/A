package com.infy;

import com.infy.Service.*;
import java.util.List;
import java.util.ArrayList;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        EmployeeService service = (EmployeeService) context.getBean("employeeService");

        service.insert(new EmployeeDTO(103, "Sneha", "CS"));
        service.insert(new EmployeeDTO(104, "John", "EEE"));
        service.insert(new EmployeeDTO(105, "Kevin", "IT"));
        service.delete(101);
        service.delete(102);

        List<EmployeeDTO> empList = new ArrayList<>();
        empList = service.getAllCustomer();

        for (EmployeeDTO e : empList) {
            System.out.println(e);
        }

        context.close();
    }
}
