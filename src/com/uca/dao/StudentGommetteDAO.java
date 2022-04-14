package com.uca.dao;

import com.uca.entity.*;
import com.uca.dao.*;



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
                
                entity.setTeacher(new TeacherDAO().getTeacherById(entity.getIdTeacher()));
                entity.setStudent(new StudentDAO().getStudentById(entity.getIdStudent()));
                entity.setGommette(new GommetteDAO().getGommetteById(entity.getIdGommette()));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    public ArrayList<StudentGommetteEntity> getAllStudentGommettes() {
        ArrayList<StudentGommetteEntity> entities = new ArrayList<>();
        try {
            String query = "SELECT * FROM studentGommettes ORDER BY id ASC;";
            PreparedStatement preparedStatement = this.connect.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                StudentGommetteEntity entity = new StudentGommetteEntity();
                entity.setId(resultSet.getInt("id"));
                entity.setIdGommette(resultSet.getInt("idGommette"));
                entity.setIdStudent(resultSet.getInt("idStudent"));
                entity.setIdTeacher(resultSet.getInt("idTeacher"));
                entity.setReason(resultSet.getString("reason"));
                
                entity.setTeacher(new TeacherDAO().getTeacherById(entity.getIdTeacher()));
                entity.setStudent(new StudentDAO().getStudentById(entity.getIdStudent()));
                entity.setGommette(new GommetteDAO().getGommetteById(entity.getIdGommette()));

                entities.add(entity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entities;
    }

    public void createStudentGommette(String idTeacher, String idStudent, String idGommette, String reason) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("INSERT INTO studentGommettes (idGommette, idStudent, idTeacher, reason) VALUES(?, ?, ?, ?);");
            preparedStatement.setString(1, idGommette);
            preparedStatement.setString(2, idStudent);
            preparedStatement.setString(3, idTeacher);
            preparedStatement.setString(4, reason);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudentGommette(int id) {
        try {
            PreparedStatement preparedStatement = this.connect.prepareStatement("DELETE FROM studentGommettes WHERE id = "+ Integer.toString(id) +";");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
