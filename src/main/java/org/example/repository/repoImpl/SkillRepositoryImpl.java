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

    public void createSkill(Skill newSkill){
        List<Skill> skills = skillRepository.getAll();
        skills.add(newSkill);
        System.out.printf(newSkill + " :added to the list");
    }

    public Skill updateSkill(Long id, String name){

       Skill skill1 = new Skill();

       skill1.setId(id);
       skill1.setName(name);
       return skill1;
    }
}
