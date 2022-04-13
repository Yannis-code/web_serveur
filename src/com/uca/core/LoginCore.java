package com.uca.core;

import com.uca.core.TeacherCore;
import com.uca.dao.TeacherDAO;
import com.uca.entity.UserEntity;
import com.uca.entity.TeacherEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.GommetteEntity;

import java.util.ArrayList;

public class LoginCore {

    public static boolean authentificate(String name, String pswr) {
        TeacherEntity teacher = TeacherCore.getTeacherByName(name);
        if (teacher != null) {
            return teacher.getUsername().equals(name) && teacher.getPassword().equals(pswr);
        }
        return false;
    }

}
