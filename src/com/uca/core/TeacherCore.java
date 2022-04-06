package com.uca.core;

import com.uca.dao.TeacherDAO;
import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;

import java.util.ArrayList;

public class TeacherCore {

    public static ArrayList<StudentEntity> getAllStudents() {
        return new TeacherDAO().getAllStudents();
    }

}
