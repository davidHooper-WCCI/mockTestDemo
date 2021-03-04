package com.example.testdemo.storage;

import com.example.testdemo.Student;
import com.example.testdemo.exceptions.ResourceNotFoundException;
import com.example.testdemo.storage.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentStorage {
    @Autowired
    private StudentRepository studentRepo;

    public StudentStorage(StudentRepository studentRepo){
        this.studentRepo = studentRepo;
    }
    public Student findStudentById(Long id){
        Optional<Student> studentOptional = studentRepo.findById(id);
        Student retrievedStudent;
        if(studentOptional.isEmpty()){
            throw new ResourceNotFoundException("Student not Found.");
        }
        else {
            retrievedStudent = studentOptional.get();

        }
        return retrievedStudent;

    }


}
