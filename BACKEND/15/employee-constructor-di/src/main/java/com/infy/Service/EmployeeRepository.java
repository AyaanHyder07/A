package com.infy.Service;

import java.util.List;

public interface EmployeeRepository {
    public void insertEmployee(EmployeeDTO emp);
    public void removeEmployee(int empId);
    List<EmployeeDTO> fetchCustomers();
}
