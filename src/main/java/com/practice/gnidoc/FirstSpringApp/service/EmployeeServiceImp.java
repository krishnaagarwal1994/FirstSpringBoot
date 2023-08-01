package com.practice.gnidoc.FirstSpringApp.service;

import com.practice.gnidoc.FirstSpringApp.entity.Employee;
import com.practice.gnidoc.FirstSpringApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImp(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByID(int employeeID) {
        Optional<Employee> result = employeeRepository.findById(employeeID);
        Employee employee = null;
        if (result.isPresent()) {
            employee = result.get();
        }
        return employee;
    }

    @Override
    public void deleteEmployeeByID(int employeeID) {
        employeeRepository.deleteById(employeeID);
    }
}
