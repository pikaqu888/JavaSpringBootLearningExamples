package com.devcology.MongoDBCRUD.service.impl;

import com.devcology.MongoDBCRUD.dto.StudentDTO;
import com.devcology.MongoDBCRUD.model.Student;
import com.devcology.MongoDBCRUD.repository.StudentRepository;
import com.devcology.MongoDBCRUD.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll()
                .stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO findByID(String id) {
        return convertEntityToDTO(studentRepository.findById(id).get());
    }

    @Override
    public StudentDTO findByEmail(String email) {
        return convertEntityToDTO(studentRepository.findByEmail(email));
    }

    @Override
    public StudentDTO createStudent(StudentDTO student) {
        Student studentDTO = converDTOtoEntity(student);
        return convertEntityToDTO(studentRepository.save(studentDTO));
    }

    private StudentDTO convertEntityToDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setGpa(student.getGpa());
        return studentDTO;
    }

    private Student converDTOtoEntity(StudentDTO studentDTO) {
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setEmail(studentDTO.getEmail());
        student.setGpa(studentDTO.getGpa());
        return student;
    }
}
