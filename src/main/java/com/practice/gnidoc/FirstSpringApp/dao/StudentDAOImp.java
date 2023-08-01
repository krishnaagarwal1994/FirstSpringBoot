package com.practice.gnidoc.FirstSpringApp.dao;

import com.practice.gnidoc.FirstSpringApp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImp implements StudentDAO{

    private final EntityManager entityManager;

    @Autowired
    public StudentDAOImp(EntityManager manager) {
        entityManager = manager;
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findStudentWith(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student", Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findStudentsWith(String lastName) {
        TypedQuery<Student> theQuery = entityManager.createQuery("from Student where lastName=:lastName", Student.class);
        theQuery.setParameter("lastName", lastName);
        return theQuery.getResultList();
    }

    @Override
    public void deleteStudentWithID(int studentID) {
        Student student = entityManager.find(Student.class, studentID);
        System.out.println("Student details - " + student.toString());
        entityManager.remove(student);
    }
}
