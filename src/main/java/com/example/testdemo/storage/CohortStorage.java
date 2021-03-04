package com.example.testdemo.storage;

import com.example.testdemo.storage.repositories.CohortRepository;
import org.springframework.stereotype.Service;

@Service
public class CohortStorage {
    private CohortRepository cohortRepository;
    public CohortStorage(CohortRepository cohortRepo){
        this.cohortRepository = cohortRepo;
    }

}
