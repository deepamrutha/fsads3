package com.klu.service;

import java.util.List;
import com.klu.model.Student;

public interface StudentService {

    // CREATE
    Student createStudent(Student student);

    // READ BY ID
    Student getStudentById(int id);

    // READ ALL
    List<Student> getAllStudents();

    // UPDATE
    Student updateStudent(int id, Student student);

    // DELETE
    String deleteStudent(int id);

    // SEARCH
    List<Student> searchStudent(String name, String course);
}