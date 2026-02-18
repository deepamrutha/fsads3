package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // Welcome API
    @GetMapping("/welcome")
    public String welcome() {
        return service.getWelcomeMessage();
    }

    // CREATE
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    // READ BY ID
    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // READ ALL
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }

    // SEARCH
    @GetMapping("/search/{name}")
    public List<Student> searchStudent(@PathVariable String name) {
        return service.searchStudent(name);
    }
}

