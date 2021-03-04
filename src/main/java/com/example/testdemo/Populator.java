package com.example.testdemo;

import com.example.testdemo.storage.CohortStorage;
import com.example.testdemo.storage.repositories.CohortRepository;
import com.example.testdemo.storage.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CohortRepository cohortRepository;

    @Override
    public void run(String... args) throws Exception{
        Cohort java = new Cohort("Java", "Columbus");
        Student mochi = new Student("Mochi", "WCCI");
        cohortRepository.save(java);
        studentRepository.save(mochi);
        System.out.println("Testing");
    }

}
