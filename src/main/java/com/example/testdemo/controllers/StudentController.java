package com.example.testdemo.controllers;

import com.example.testdemo.Student;
import com.example.testdemo.storage.CohortStorage;
import com.example.testdemo.storage.StudentStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {
    private StudentStorage studentStorage;
    private CohortStorage cohortStorage;

    public StudentController(StudentStorage studentStorage, CohortStorage cohortStorage){
        this.studentStorage = studentStorage;
        this.cohortStorage = cohortStorage;
    }
    @GetMapping("Students/{id}")
    public String showSingleStudent(@PathVariable long id, Model model) {
        model.addAttribute("Student", studentStorage.findStudentById(id));
        return "student-template";
    }
}
