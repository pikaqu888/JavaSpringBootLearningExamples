package com.devcology.MongoDBCRUD.controller;

import com.devcology.MongoDBCRUD.dto.StudentDTO;
import com.devcology.MongoDBCRUD.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findAll());
    }

    @PostMapping(value = "/students")
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(studentDTO));
    }

    @GetMapping(value = "/students/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findByID(id));
    }

    @GetMapping(value = "/students/email/{email}")
    public ResponseEntity<StudentDTO> getStudentByEmail(@PathVariable String email) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findByEmail(email));
    }

}
