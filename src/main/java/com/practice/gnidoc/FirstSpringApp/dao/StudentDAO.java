package com.practice.gnidoc.FirstSpringApp.dao;

import com.practice.gnidoc.FirstSpringApp.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findStudentWith(int id);

    List<Student> findAll();

    List<Student> findStudentsWith(String lastName);

    void deleteStudentWithID(int studentID);
}
