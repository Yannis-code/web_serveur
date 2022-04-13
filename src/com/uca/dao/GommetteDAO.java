package com.uca.dao;

import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;


import java.sql.*;
import java.util.ArrayList;

public class GommetteDAO extends _Generic<GommetteEntity>{

    
    public ArrayList<GommetteEntity> getAllGommettes() {
        ArrayList<GommetteEntity> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM gommettes ORDER BY id ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                GommetteEntity entity = new GommetteEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setName(resultSet.getString("name"));
                entity.setDesc(resultSet.getString("desc"));
                entity.setColor(resultSet.getString("color"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    public GommetteEntity getGommetteById(String id) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM gommettes WHERE id = ?;");
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                GommetteEntity entity = new GommetteEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setName(resultSet.getString("name"));
                entity.setDesc(resultSet.getString("desc"));
                entity.setColor(resultSet.getString("color"));
                return entity;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteGommette(int id) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("DELETE FROM studentGommettes WHERE idGommette = "+ Integer.toString(id) +";");
            preparedStatement.executeUpdate();
            preparedStatement = this.connect.prepareStatement("DELETE FROM gommettes WHERE id = "+ Integer.toString(id) +";");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public GommetteEntity create(GommetteEntity obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(GommetteEntity obj) {
        //TODO !
    }
}
