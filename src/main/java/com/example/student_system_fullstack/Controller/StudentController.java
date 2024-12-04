package com.example.student_system_fullstack.Controller;
import com.example.student_system_fullstack.model.Student;
import com.example.student_system_fullstack.repository.StudentRepository;
import com.example.student_system_fullstack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students") // Typically, REST endpoints use lowercase and plural naming conventions
public class StudentController {

    @Autowired
    private StudentService studentService;
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Student added successfully!";
    }
    @GetMapping("/GetData")
    public List<Student> getStudentData(){
        return studentService.getStudentData();
    }
}
