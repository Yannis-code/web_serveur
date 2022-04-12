package com.uca.core;

import com.uca.dao.TeacherDAO;
import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;

import java.util.ArrayList;

public class TeacherCore {

    public static ArrayList<StudentEntity> getAllStudents() {
        return new TeacherDAO().getAllStudents();
    }

    public static ArrayList<TeacherEntity> getAllTeachers() {
        return new TeacherDAO().getAllTeachers();
    }


    public static void deleteStudent(int id) {
        new TeacherDAO().deleteStudent(id);
    }

}
