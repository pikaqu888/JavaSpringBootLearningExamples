package com.devcology.MongoDBCRUD.repository;

import com.devcology.MongoDBCRUD.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByEmail(String email);
}
