package com.klu.service.impl;

import org.springframework.stereotype.Service;
import com.klu.model.Student;
import com.klu.service.StudentService;   
import java.util.List;
import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {

    List<Student> studentList = new ArrayList<>();

    @Override
    public String getWelcomeMessage() {
        return "Welcome to Student MVC CRUD Application";
    }


    // Create
    @Override
    public Student createStudent(Student student) {
        studentList.add(student);  
        return student;
    }

    // Read by ID
    @Override
    public Student getStudentById(int id) {
        for (Student s : studentList) {   
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Read All
    @Override
    public List<Student> getAllStudents() {
        return studentList;   
    }

    // Update
    @Override
    public Student updateStudent(int id, Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                student.setId(id);
                studentList.set(i, student);  
                return student;
            }
        }
        return null;  
    }
    //delete
    @Override
    public String deleteStudent(int id) {
     for(Student s: studentList) {
      if(s.getId()==id) {
       studentList.remove(s);
       return "Student record deleted successfully";
      }
     }
     return "no student record found";
    }
    //SEARCH
    @Override
    public List<Student> searchStudent(String name, String course) {
        List<Student> result = new ArrayList<>();

        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        return result;
}
}