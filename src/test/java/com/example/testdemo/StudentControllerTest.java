package com.example.testdemo;

import com.example.testdemo.controllers.StudentController;
import com.example.testdemo.storage.CohortStorage;
import com.example.testdemo.storage.StudentStorage;
import com.example.testdemo.storage.repositories.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.mockito.Mockito.*;

public class StudentControllerTest {
   private CohortStorage mockCohortStorage = mock(CohortStorage.class);
   private StudentStorage mockStudentStorage = mock(StudentStorage.class);
//    private StudentController underTest;

//    @BeforeEach
//    void setUp(){
    @Test
    public void shouldAskStudentStorageForCorrectStudentWhenGivenIdAndPassesItToTheModel() {

//        underTest = new StudentController(mockStudentStorage, mockCohortStorage);
//    }
        //Arrangement
        StudentRepository studentRepo = mock(StudentRepository.class);
        Student testStudent = new Student("Tester", "Testy");
        when(mockStudentStorage.findStudentById(1L)).thenReturn(testStudent);
        StudentController underTest = new StudentController(mockStudentStorage, mockCohortStorage);
        Model mockModel = mock(Model.class);
        Student mockStudent = mock(Student.class);
        //Action
        underTest.showSingleStudent(1L, mockModel);
        //Assertion
        verify(mockStudentStorage).findStudentById(1L);
        //(mockModel).addAttribute("student",testStudent);
    }


    //Action

    //Assertion

}
