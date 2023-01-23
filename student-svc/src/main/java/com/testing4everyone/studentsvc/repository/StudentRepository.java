package com.testing4everyone.studentsvc.repository;

import com.testing4everyone.studentsvc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Optional<Student> findByName(String studentName);
    Optional<Student> findByEmail(String studentEmail);
}
