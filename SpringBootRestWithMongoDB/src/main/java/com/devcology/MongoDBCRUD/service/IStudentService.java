package com.devcology.MongoDBCRUD.service;

import com.devcology.MongoDBCRUD.dto.StudentDTO;

import java.util.List;

public interface IStudentService {

    List<StudentDTO> findAll();
    StudentDTO findByID(String id);
    StudentDTO findByEmail(String email);
    StudentDTO createStudent(StudentDTO student);
}
