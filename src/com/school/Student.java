package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;

    private int studentId;
    private String name;

    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    //getter for studentName
    public int getStudentId() {
        return studentId;
    }
    //getter for name
    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}