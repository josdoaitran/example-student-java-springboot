package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(String studentId);
    public Optional<Student> getStudentByName(String studentId);
    public void deleteStudentId(String studentId);
}
