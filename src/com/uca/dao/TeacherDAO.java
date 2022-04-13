package com.uca.dao;

import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;

import java.sql.*;
import java.util.ArrayList;

public class TeacherDAO extends _Generic<TeacherEntity>{

    public ArrayList<StudentEntity> getAllStudents() {
        ArrayList<StudentEntity> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM Students ORDER BY id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentEntity entity = new StudentEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setFirstName(resultSet.getString("firstname"));
                entity.setLastName(resultSet.getString("lastname"));
                entity.setClassroom(resultSet.getString("class"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    public ArrayList<TeacherEntity> getAllTeachers() {
        ArrayList<TeacherEntity> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM teachers ORDER BY id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TeacherEntity entity = new TeacherEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setFirstName(resultSet.getString("firstname"));
                entity.setLastName(resultSet.getString("lastname"));
                entity.setUsername(resultSet.getString("username"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }


    @Override
    public TeacherEntity create(TeacherEntity obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(TeacherEntity obj) {
        //TODO !
    }
}
