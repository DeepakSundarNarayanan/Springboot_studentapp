package com.studentportal.studentportal.service;

import com.studentportal.studentportal.modal.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
