package com.example.Student.service;

import com.example.Student.model.Student;
import java.util.List;

public interface InterfaceStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
