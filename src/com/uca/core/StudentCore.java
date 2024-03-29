package com.uca.core;

import com.uca.dao.StudentDAO;
import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;

import java.util.ArrayList;

public class StudentCore {

    public static void createStudent(String firstname, String lastname, String classroom) {
        new StudentDAO().createStudent(firstname, lastname, classroom);
    }

    public static void modifyStudent(String ID, String firstname, String lastname, String classroom) {
        new StudentDAO().modifyStudent(ID, firstname, lastname, classroom);
    }

    public static void deleteStudent(int id) {
        new StudentDAO().deleteStudent(id);
    }

    public static ArrayList<StudentEntity> getAllStudents() {
        return new StudentDAO().getAllStudents();
    }
}
