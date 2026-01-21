package com.klu.model;

public class CourseRegistration {

    private int id;
    private String studentName;
    private String courseName;
    private int semester;

    public CourseRegistration(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

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