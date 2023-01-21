package com.testing4everyone.studentsvc.service;

import com.testing4everyone.studentsvc.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getStudentById(String studentId);
    public Optional<Student> getStudentByName(String studentName);
    public Optional<Student> getStudentByEmail(String studentName);
    public Student updateStudentInfoById(String studentId, Student studentName);
    public void deleteStudentId(String studentId);
}
