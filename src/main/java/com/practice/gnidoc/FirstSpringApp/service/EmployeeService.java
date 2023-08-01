package com.practice.gnidoc.FirstSpringApp.service;

import com.practice.gnidoc.FirstSpringApp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void createEmployee( Employee employee);
    List<Employee> getAllEmployees();

    Employee getEmployeeByID(int employeeID);

    void deleteEmployeeByID(int employeeID);

}
