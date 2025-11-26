package com.infy;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeServiceImpl;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context =
                (AbstractApplicationContext) SpringApplication.run(App.class, args);

        EmployeeServiceImpl service =
                (EmployeeServiceImpl) context.getBean("employeeService");

        service.insert(new EmployeeDTO(102,"kevin","SC"));
        service.insert(new EmployeeDTO(103,"Jammes","CS"));
        service.insert(new EmployeeDTO(104,"Alice","IIT"));
        service.insert(new EmployeeDTO(105,"Leo","ETA"));

        service.delete(1);
        service.delete(2);

        List<EmployeeDTO> empList = new ArrayList<>();
        empList = service.getALLEmployee();
        for (EmployeeDTO e : empList) {
            System.out.println(e);
        }
        context.close();
    }
}
