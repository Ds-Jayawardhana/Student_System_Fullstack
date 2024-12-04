package com.example.student_system_fullstack.service;

import com.example.student_system_fullstack.model.Student;

import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student>getStudentData();

}

