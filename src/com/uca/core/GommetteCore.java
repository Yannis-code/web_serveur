package com.uca.core;

import com.uca.dao.GommetteDAO;
import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentGommetteEntity;

import java.util.ArrayList;

public class GommetteCore {

    public static ArrayList<GommetteEntity> getAllGommettes() {
        return new GommetteDAO().getAllGommettes();
    }
}
