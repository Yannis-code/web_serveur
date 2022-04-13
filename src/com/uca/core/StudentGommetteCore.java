package com.uca.core;

import com.uca.dao.StudentGommetteDAO;
import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;

import java.util.ArrayList;

public class StudentGommetteCore {

    public static ArrayList<StudentGommetteEntity> getAllStudentGommettes() {
        return new StudentGommetteDAO().getAllStudentGommettes();
    }

    public static ArrayList<StudentGommetteEntity> getStudentGommettes(int id) {
        return new StudentGommetteDAO().getStudentGommettes(id);
    }

    public static void deleteStudentGommette(int id) {
        new StudentGommetteDAO().deleteStudentGommette(id);
    }
}
