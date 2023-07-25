package org.example.repository.repoImpl;

import org.example.model.Skill;
import org.example.repository.SkillRepository;

import java.util.List;

public class SkillRepositoryImpl {

    SkillRepository skillRepository;

    public Skill getById(Long id){
        return skillRepository.getByID(id);
    }

    public List<Skill> getAll(){
        return skillRepository.getAll();
    }

    public void addSkill(){
        //TODO
    }

    public Skill updateSkill(Skill skill){
       return null;
       //todo
    }
}
