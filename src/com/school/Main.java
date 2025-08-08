package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== School Attendance System ====");
        

        System.out.println("\nCreating Students and Courses using Constructors:");
        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob The Builder");

        Course course1 = new Course("Intro to Programming");
        Course course2 = new Course("Linear Algebra");

        System.out.println("\nRegistered Students:");
        student1.displayDetails();
        student2.displayDetails();

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();
        course2.displayDetails();

        // System.out.println("\n== Auto-ID Generation Test ==");
        // System.out.println("Creating one more student and course...");
        Student student3 = new Student("Charlie Chaplin");
        Course course3 = new Course("Data Structures");

        // System.out.println("\nNew Student:");
        // student3.displayDetails();

        // System.out.println("New Course:");
        // course3.displayDetails();

        // --- Attendance Recording ---
    System.out.println("\n--- Attendance Recording ---");
    List<AttendanceRecord> attendanceLog = new ArrayList<>();

    // Record valid attendance
    AttendanceRecord record1 = new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present");
    attendanceLog.add(record1);

    // Attempt to record invalid attendance status
    AttendanceRecord record2 = new AttendanceRecord(student2.getStudentId(), course1.getCourseId(), "Late");
    attendanceLog.add(record2); // Will be stored as "Invalid"

    // Record another valid attendance
    AttendanceRecord record3 = new AttendanceRecord(student2.getStudentId(), course1.getCourseId(), "Absent");
    attendanceLog.add(record3);

    System.out.println("\n---Attendance Log---");
    for (AttendanceRecord record : attendanceLog) {
        record.displayRecord();
    }

        System.out.println("\nSession 4: Data encapsulation & Attendance Recording Complete.");
    }
}