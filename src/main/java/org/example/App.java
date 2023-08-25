package org.example;

import org.example.controller.SkillController;

public class App
{
    public static void main( String[] args ){
        SkillController skillController = new SkillController();

        //skillController.getById();
        //skillController.getAll();
        skillController.addSkill();

        System.out.println( "Hello World!" );
    }
}
