package com.uca.dao;

import java.sql.*;

public class _Initializer {

    public static void Init(){
        Connection connection = _Connector.getInstance();

        try {
            PreparedStatement statement;

            //Init articles table
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS students (id int primary key auto_increment, firstname varchar(100), lastname varchar(100), class varchar(100)); ");
            statement.executeUpdate();
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS teachers (id int primary key auto_increment, firstname varchar(100), lastname varchar(100), username varchar(100)); ");
            statement.executeUpdate();
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS gommettes (id int primary key auto_increment, name varchar(100), desc varchar(100), color varchar(100)); ");
            statement.executeUpdate();
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS studentGommettes (id int primary key auto_increment, idGommette int, idStudent int, idTeacher int, reason varchar(100)); ");
            statement.executeUpdate();

            //Todo Remove me !
            statement = connection.prepareStatement("INSERT INTO students(firstname, lastname, class) VALUES(?, ?, ?);");
            statement.setString(1, "Pierre");
            statement.setString(2, "bouterige");
            statement.setString(3, "prepisima");
            statement.executeUpdate();

            statement = connection.prepareStatement("INSERT INTO gommettes (name, desc, color) VALUES(?, ?, ?);");
            statement.setString(1, "Travailleur");
            statement.setString(2, "excellent travail");
            statement.setString(3, "verte");
            statement.executeUpdate();

        } catch (Exception e){
            System.out.println(e.toString());
            throw new RuntimeException("could not create database !");
        }
    }
}
