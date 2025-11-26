package com.infy.Service;

import java.util.List;
import java.util.ArrayList;
import jakarta.annotation.PostConstruct;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private List<EmployeeDTO> employees = new ArrayList<>();

    @PostConstruct
    public void initializer() {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpId(101);
        employeeDTO.setEmpName("Sujata");
        employeeDTO.setEmpDepartment("CSE");
        employees.add(employeeDTO);
    }

    @Override
    public void insertEmployee(EmployeeDTO emp) {
        employees.add(emp);
    }

    @Override
    public void removeEmployee(int empId) {
        if (employees == null) return;
        employees.removeIf(emp -> emp.getEmpId() == empId);
    }

    @Override
    public List<EmployeeDTO> fetchCustomers() {
        return employees;
    }
}
