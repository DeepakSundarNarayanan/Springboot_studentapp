package com.studentportal.studentportal.controller;

import com.studentportal.studentportal.modal.Student;
import com.studentportal.studentportal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "success";

    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }
}
