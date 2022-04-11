package com.uca.core;

import com.uca.dao.StudentDAO;
import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;

import java.util.ArrayList;

public class StudentCore {

    public static ArrayList<GommetteEntity> getAllGommettes() {
        return new StudentDAO().getAllGommettes();
    }


}
