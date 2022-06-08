package com.testing4everyone.studentsystem.service;

import com.testing4everyone.studentsystem.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(String studentId);
    public Optional<Student> getStudentByName(String studentId);
    public Student updateStudentInfoById(String studentId, Student studentName);
    public void deleteStudentId(String studentId);
}
