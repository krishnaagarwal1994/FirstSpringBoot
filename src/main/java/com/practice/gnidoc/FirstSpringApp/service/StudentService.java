package com.practice.gnidoc.FirstSpringApp.service;

import com.practice.gnidoc.FirstSpringApp.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentWithID(int studentID);

    void createStudent(Student student);

    void deleteStudentWithID(int studentID);
}
