package org.example.repository.repoImpl;

import org.example.model.Developer;
import org.example.repository.DeveloperRepository;
import org.example.repository.GenericRepository;

import java.util.List;

public class DeveloperRepositoryImpl {
    DeveloperRepository developerRepository;

    public Developer getByID(Long id){
        return developerRepository.getByID(id);
    }

    public List<Developer> getAll(){
        return developerRepository.getAll();
    }



}
