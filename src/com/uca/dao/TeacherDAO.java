package com.uca.dao;

import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;

import java.sql.*;
import java.util.ArrayList;

public class TeacherDAO extends _Generic<TeacherEntity>{


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
                entity.setPassword(resultSet.getString("password"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    public TeacherEntity getTeacherByName(String name) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM teachers WHERE username = ?;");
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                TeacherEntity entity = new TeacherEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setFirstName(resultSet.getString("firstname"));
                entity.setLastName(resultSet.getString("lastname"));
                entity.setUsername(resultSet.getString("username"));
                return entity;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
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
