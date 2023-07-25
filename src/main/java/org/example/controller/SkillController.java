package org.example.controller;

import org.example.model.Skill;
import org.example.repository.SkillRepository;
import org.example.repository.repoImpl.SkillRepositoryImpl;

import java.util.List;

public class SkillController {

    static final String JDBC_DRIVER =  "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    SkillRepositoryImpl skillRepository;

    public String findAll(){
        List<Skill> skills = skillRepository.getAll();
        return skills.toString();
    }

    public Skill createSkill(Long id, String name){
        Skill skill = new Skill();
        skill.setId(1);
        skill.setName("coding");
        return skill;
    }

    public void updateSkill(){
        //todo
    }
}
