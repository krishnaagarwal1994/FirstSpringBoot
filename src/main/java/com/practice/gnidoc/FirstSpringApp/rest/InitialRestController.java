package com.practice.gnidoc.FirstSpringApp.rest;

import com.practice.gnidoc.FirstSpringApp.entity.*;
import com.practice.gnidoc.FirstSpringApp.exception.StudentNotFoundException;
import com.practice.gnidoc.FirstSpringApp.service.EmployeeService;
import com.practice.gnidoc.FirstSpringApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InitialRestController {

    //Private variable for the dependency
    private StudentService studentService;  //This service implementation uses the Java JPA.
    private EmployeeService employeeService;    //This service implementation uses the Spring Data JPA. Here
    //we don't need DAO interface file, DAO imp file along with it's implemented, here we just need single file with 3 lines of code.

    @Autowired
    public InitialRestController(StudentService theStudentService, EmployeeService theEmployeeService) {
        this.studentService = theStudentService;
        employeeService = theEmployeeService;
    }

//    Endpoint to create a new student
    @PostMapping("/students")
    public void createStudent(@RequestBody StudentRequestModel requestModel) {
        System.out.println("Received request body");
        System.out.println(requestModel.firstName);
        System.out.println(requestModel.lastName);
        System.out.println(requestModel.email);
        Student student = new Student(requestModel.firstName, requestModel.lastName, requestModel.email);
        studentService.createStudent(student);
    }

    //    EndPoint to get the student by ID
    @GetMapping("/students/{studentID}")
    public Student getStudentByID(@PathVariable int studentID) {
        Student student = studentService.getStudentWithID(studentID);
        if (student == null) {
            throw new StudentNotFoundException("Student ID = " + studentID + " not found");
        } else {
            return student;
        }
    }

//    EndPoint to list all the students present in the DB.
    @GetMapping("/students")
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }

//    EndPoint to delete the student for a given student id
    @DeleteMapping("/students/{studentID}")
    public void deleteStudentWithID(@PathVariable int studentID) {
        studentService.deleteStudentWithID(studentID);
    }

    @PostMapping("/employees")
    public void createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
