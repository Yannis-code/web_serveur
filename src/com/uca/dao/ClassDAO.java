package com.uca.dao;

import com.uca.entity.UserEntity;
import com.uca.entity.ClassEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;


import java.sql.*;
import java.util.ArrayList;

public class ClassDAO extends _Generic<ClassEntity>{

    
    public ArrayList<ClassEntity> getAllClasses() {
        ArrayList<ClassEntity> entities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT DISTINCT class FROM students ORDER BY class ASC;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ClassEntity entity = new ClassEntity();
                entity.setClassroom(resultSet.getString("class"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    @Override
    public ClassEntity create(ClassEntity obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(ClassEntity obj) {
        //TODO !
    }
}
