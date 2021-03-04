package com.example.testdemo.storage.repositories;

import com.example.testdemo.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
