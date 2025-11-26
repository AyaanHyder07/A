package com.infy.Service;

import java.util.List;

public interface EmployeeService {
    public void insert(EmployeeDTO emp);
    public void delete(int empId);
    List<EmployeeDTO> getAllCustomer();
}
