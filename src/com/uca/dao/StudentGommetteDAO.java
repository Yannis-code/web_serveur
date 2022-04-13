package com.uca.dao;

import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;


import java.sql.*;
import java.util.ArrayList;

public class StudentGommetteDAO extends _Generic<StudentGommetteEntity>{

    public ArrayList<StudentGommetteEntity> getStudentGommettes(int id) {
        ArrayList<StudentGommetteEntity> entities = new ArrayList<>();
        try {
            String query = "SELECT * FROM studentGommettes WHERE idStudent = " + Integer.toString(id) + " ORDER BY id ASC;";
            PreparedStatement preparedStatement = this.connect.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentGommetteEntity entity = new StudentGommetteEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setIdGommette(resultSet.getInt("idGommette"));
                entity.setIdStudent(resultSet.getInt("idStudent"));
                entity.setIdTeacher(resultSet.getInt("idTeacher"));
                entity.setReason(resultSet.getString("reason"));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }


    @Override
    public StudentGommetteEntity create(StudentGommetteEntity obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(StudentGommetteEntity obj) {
        //TODO !
    }
}