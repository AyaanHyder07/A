package com.infy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.dto.EmployeeDTO;
import com.infy.repo.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        employeeDAO = repository;
    }

    @Override
    public void insert(EmployeeDTO employeeDTO) {
        employeeDAO.insertEmployee(employeeDTO);
    }

    @Override
    public void delete(int empId) {
        employeeDAO.removeEmployee(empId);
    }

    @Override
    public List<EmployeeDTO> getALLEmployee() {
        return employeeDAO.fetchEmployee();
    }
}
