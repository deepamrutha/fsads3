package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CourseRegistration {

    private int id;
    private String studentName;
    private String courseName;
    private int semester;
    public CourseRegistration(@Value("101")int id, @Value("Sravyanjali")String studentName) {
        this.id = id;
        this.studentName = studentName;
    }
    @Value("FSAD")
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Value("4")

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void display() {
        System.out.println(id);
        System.out.println(studentName);
        System.out.println(courseName);
        System.out.println(semester);
    }
}