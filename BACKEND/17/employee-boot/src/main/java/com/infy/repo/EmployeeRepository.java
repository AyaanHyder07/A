package com.infy.repo;

import org.springframework.stereotype.Component;
import com.infy.dto.EmployeeDTO;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.PostConstruct;

@Component
public class EmployeeRepository {

    List<EmployeeDTO> employee = null;

    @PostConstruct
    public void initilizer() {

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpIdid(101);
        employeeDTO.setEmpName("Jack");
        employeeDTO.setEmpDept("IT");
        employee = new ArrayList<>();
        employee.add(employeeDTO);
    }

    public void insertEmployee(EmployeeDTO employeeDTO) {
        employee.add(employeeDTO);
    }

    public void removeEmployee(int empId) {
        employee.remove(empId);
    }

    public List<EmployeeDTO> fetchEmployee() {
        return employee;
    }
}
