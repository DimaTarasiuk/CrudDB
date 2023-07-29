package org.example.controller;

import org.example.model.Skill;
import org.example.repository.SkillRepository;
import org.example.repository.repoImpl.SkillRepositoryImpl;

import java.sql.*;
import java.util.List;

public class SkillController  {
    public SkillController() throws SQLException {
    }

    static final String JDBC_DRIVER =  "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/";
    Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "1000");

    String insertQuery = "insert into skills (name) values (?);";
    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
    preparedStatement.setSkill("Java"); //error

    int affectedRows = preparedStatement.executeUpdate();

    ResultSet resultSet = preparedStatement.executeQuery();

    while(resultSet.next()){  //error
        String name = resultSet.getString("name");
        System.out.println("Обработка данних");
    }

}
