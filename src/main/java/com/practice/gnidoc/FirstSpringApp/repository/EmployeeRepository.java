package com.practice.gnidoc.FirstSpringApp.repository;

import com.practice.gnidoc.FirstSpringApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    That's it, no more code required, you will get the DAO interface and IMP for free here completely.
}
