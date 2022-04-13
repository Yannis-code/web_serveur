package com.uca.dao;

import java.sql.*;

public class _Initializer {

    public static void Init(){
        Connection connection = _Connector.getInstance();

        try {
            PreparedStatement statement;

            //Init articles table
            // statement = connection.prepareStatement("DROP TABLE  studentGommettes IF EXISTS");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("DROP TABLE  students IF EXISTS");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("DROP TABLE  teachers IF EXISTS");
            // statement.executeUpdate();
            // statement = connection.prepareStatement("DROP TABLE  gommettes IF EXISTS");
            // statement.executeUpdate();

            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS students (id int primary key auto_increment, firstname varchar(100), lastname varchar(100), class varchar(100)); ");
            statement.executeUpdate();
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS teachers (id int primary key auto_increment, firstname varchar(100), lastname varchar(100), username varchar(100), password varchar(100)); ");
            statement.executeUpdate();
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS gommettes (id int primary key auto_increment, name varchar(100), desc varchar(100), color varchar(100)); ");
            statement.executeUpdate();
            String tmp = "CREATE TABLE IF NOT EXISTS studentGommettes (id int auto_increment, idGommette int, idStudent int, idTeacher int, reason varchar(100)";
            tmp += ", PRIMARY KEY (id)";
            tmp += ", FOREIGN KEY (idGommette) REFERENCES gommettes(id)";
            tmp += ", FOREIGN KEY (idStudent) REFERENCES students(id)";
            tmp += ", FOREIGN KEY (idTeacher) REFERENCES teachers(id));";
            statement = connection.prepareStatement(tmp);
            statement.executeUpdate();

            // statement = connection.prepareStatement("DELETE FROM gommettes WHERE id = 2;");
            // statement.executeUpdate();

            //Todo Remove me !
            // statement = connection.prepareStatement("INSERT INTO students(firstname, lastname, class) VALUES(?, ?, ?);");
            // statement.setString(1, "Pierre");
            // statement.setString(2, "bouterige");
            // statement.setString(3, "prepisima");
            // statement.executeUpdate();

            // statement = connection.prepareStatement("INSERT INTO teachers(firstname, lastname, username, password) VALUES(?, ?, ?, ?);");
            // statement.setString(1, "Aurelie");
            // statement.setString(2, "Lagoutte");
            // statement.setString(3, "alagoutte");
            // statement.setString(4, "oui");
            // statement.executeUpdate();

            // statement = connection.prepareStatement("INSERT INTO gommettes (name, desc, color) VALUES(?, ?, ?);");
            // statement.setString(1, "Travailleur");
            // statement.setString(2, "excellent travail");
            // statement.setString(3, "verte");
            // statement.executeUpdate();

            // statement = connection.prepareStatement("INSERT INTO studentGommettes (idGommette, idStudent, idTeacher, reason) VALUES(?, ?, ?, ?);");
            // statement.setString(1, "1");
            // statement.setString(2, "1");
            // statement.setString(3, "1");
            // statement.setString(4, "Belle bite.");
            // statement.executeUpdate();

        } catch (Exception e){
            System.out.println(e.toString());
            throw new RuntimeException("could not create database !");
        }
    }
}
