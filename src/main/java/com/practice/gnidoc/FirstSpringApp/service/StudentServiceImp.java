package com.practice.gnidoc.FirstSpringApp.service;

import com.practice.gnidoc.FirstSpringApp.entity.Student;
import com.practice.gnidoc.FirstSpringApp.dao.StudentDAO;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentDAO studentDAO;

    public StudentServiceImp(StudentDAO theStudentDAO) {
        studentDAO = theStudentDAO;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    @Override
    public Student getStudentWithID(int studentID) {
        return studentDAO.findStudentWith(studentID);
    }

    @Transactional
    @Override
    public void createStudent(Student student) {
        studentDAO.save(student);
    }

    @Transactional  //Transactional annotation should be handled at this/service level only and not at the DAO level.
    @Override
    public void deleteStudentWithID(int studentID) {
        studentDAO.deleteStudentWithID(studentID);
    }
}
