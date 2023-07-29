package org.example.repository.repoImpl;

import org.example.model.Developer;
import org.example.model.Specialty;
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

    public Developer updateDeveloper(int id, String name, String sourName, Specialty specialty){

        Developer developer1 = new Developer();

        developer1.setId(id);
        developer1.setFirstName(name);
        developer1.setLastName(sourName);
        developer1.setSpecialty(specialty);
        return developer1;
    }



}
