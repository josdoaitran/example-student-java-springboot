package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Student;
import com.arjuncodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/info")
    public String studentHome(){
        return "Student Service is up";
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public ResponseEntity<Student> add(@RequestBody Student student){
        Student createdStudent = studentService.saveStudent(student);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdStudent.getId())
                .toUri();

        return ResponseEntity.created(uri).body(createdStudent);
    }

    @GetMapping("/get_all")
    public List<Student> list(){
        return studentService.getAllStudents();
    }

    @GetMapping("/get_student_id/{studentID}")
    public Optional<Student> student(@PathVariable String studentID){
        return studentService.getStudentId(studentID);
    }
}
