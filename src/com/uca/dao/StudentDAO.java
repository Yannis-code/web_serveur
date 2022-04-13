package com.uca.dao;

import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;


import java.sql.*;
import java.util.ArrayList;

public class StudentDAO extends _Generic<StudentEntity>{

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
            PreparedStatement preparedStatement = this.connect.prepareStatement("DELETE FROM studentGommettes WHERE idStudent = "+ Integer.toString(id) +";");
            preparedStatement.executeUpdate();
            preparedStatement = this.connect.prepareStatement("DELETE FROM students WHERE id = "+ Integer.toString(id) +";");
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
