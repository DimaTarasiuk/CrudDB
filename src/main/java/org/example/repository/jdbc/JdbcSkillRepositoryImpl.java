package org.example.repository.jdbc;

import org.example.model.Skill;
import org.example.repository.SkillRepository;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcSkillRepositoryImpl implements SkillRepository {

    private final String URL = "jdbc:mysql://localhost:3306/CrudDB" ;
    private final String USER = "root";
    private final String PASS = "1000";
    //TODO: create Connection - DONE
    //TODO: create PreparedStatement - DONE



    @Override
    public Skill getByID(Long id) {
        String sql = "SELECT * FROM skills WHERE id = ?";
        Skill skill = new Skill();


        try{
            Connection connection = DriverManager.getConnection(URL, USER, PASS );
            System.out.println("-----connection created-----");

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery(); //here is info from db
            //mapping result set to skill
            while (resultSet.next()){
                skill.setId(resultSet.getLong("id"));
                skill.setName(resultSet.getString("name"));
            }

            System.out.println("result is -> " + skill.toString());

            resultSet.close();
            preparedStatement.close();
            connection.close();

            System.out.println("-----Connection closed-----");
        }catch (SQLException e){
            System.out.println("!!!Connection issue!!!");
            e.printStackTrace();
        }

        return skill;

        //TODO: SELECT * FROM skills WHERE id = ? - DONE
        //TODO: map ResultSet to the Skill - DONE
        //TODO return Skill - DONE

    }

    @Override
    public List<Skill> getAll() {
        String sql = "select * from skills;";
        List<Skill> skillList = new ArrayList<>();  // ask why without array list 'null pointer'

        try{
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("-----connection created-----");

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Skill skill = new Skill();
                skill.setId(id);
                skill.setName(name);
                skillList.add(skill);

            }
            connection.close();
            resultSet.close();
            preparedStatement.close();
            System.out.println("-------Connection closed--------");
        }catch (SQLException e){
            e.printStackTrace();
        }

        //TODO: SELECT * FROM skills - DOME
        //TODO: map ResultSet to the LIST - DONE
        //TODO return list - DONE
        System.out.println("its should be skill list -> " + skillList);
        return skillList;
    }


    @Override
    public Skill save(Skill skill) {

        String sql = "INSERT INTO skills (name) values (?);";

        try{
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, skill.getName()); // !! potential issue
            ResultSet resultSet = preparedStatement.executeQuery();

            connection.close();
            preparedStatement.close();
            resultSet.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

        //TODO: INSERT INTO skills... - DONE
        //TODO: map ResultSet to the Skills with GENERATED KEY
        //TODO return Skills
        //TODO: tip -> RETURN_GENERATED_KEYS
        return null;
    }

    @Override
    public Skill update(Skill skill) {
        //TODO: UPDATE INTO skills...
        //TODO: map ResultSet to the Skills
        //TODO return Skill
        return null;
    }

    @Override
    public void deleteByID(Long aLong) {
        //TODO: DELETE FROM skills WHERE id = ...
        //TODO: map ResultSet to the Skills
        //TODO return Skill
    }
}
