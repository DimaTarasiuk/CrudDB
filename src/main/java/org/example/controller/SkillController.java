package org.example.controller;
import org.example.model.Skill;
import org.example.repository.SkillRepository;
import org.example.repository.jdbc.JdbcSkillRepositoryImpl;

import java.util.Scanner;

public class SkillController  {
    private final SkillRepository skillRepository = new JdbcSkillRepositoryImpl();

    public void getById(){
        System.out.println("Enter id");
        Scanner scanner = new Scanner(System.in);
        skillRepository.getByID(scanner.nextLong());
    }

    public void getAll(){
        skillRepository.getAll();
    }

    public void addSkill(){
        String name = "default";
        Skill skill = new Skill();
        skill.setName(name);

        skillRepository.save(skill);
    }


}
