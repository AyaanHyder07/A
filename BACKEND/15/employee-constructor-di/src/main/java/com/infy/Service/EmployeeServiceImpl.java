package com.infy.Service;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeDAO;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeDAO = employeeRepository;
    }

    @Override
    public void insert(EmployeeDTO emp) {
        employeeDAO.insertEmployee(emp);
    }

    @Override
    public void delete(int empId) {
        employeeDAO.removeEmployee(empId);
    }

    @Override
    public List<EmployeeDTO> getAllCustomer() {
        return employeeDAO.fetchCustomers();
    }
}
