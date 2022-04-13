package com.uca.dao;

import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;


import java.sql.*;
import java.util.ArrayList;

public class StudentDAO extends _Generic<StudentEntity>{


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

    public void deleteStudent(int id) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("DELETE FROM studentGommettes WHERE idStudent = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement = this.connect.prepareStatement("DELETE FROM students WHERE id = = ?;");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createStudent(String firstname, String lastname, String classroom) {
        try {
            PreparedStatement statement = this.connect.prepareStatement("INSERT INTO students(firstname, lastname, class) VALUES(?, ?, ?);");
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, classroom);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public StudentEntity getStudentById(int id) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("SELECT * FROM students WHERE id = ?;");
            preparedStatement.setString(1, Integer.toString(id));
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                StudentEntity entity = new StudentEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setFirstName(resultSet.getString("firstname"));
                entity.setLastName(resultSet.getString("lastname"));
                entity.setClassroom(resultSet.getString("class"));
                return entity;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public StudentEntity create(StudentEntity obj) {
        //TODO !
        return null;
    }

    @Override
    public void delete(StudentEntity obj) {
        //TODO !
    }
}
