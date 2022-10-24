package com.zaurtregulov.spring.springboot2.springboot_rest2.service;


import com.zaurtregulov.spring.springboot2.springboot_rest2.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
