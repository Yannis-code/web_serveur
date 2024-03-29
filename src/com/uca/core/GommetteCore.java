package com.uca.core;

import com.uca.dao.GommetteDAO;
import com.uca.dao.StudentDAO;
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

    public static void createGommette(String name, String description, String color) {
        new GommetteDAO().createGommette(name, description, color);
    }

    public static void modifyGommette(String ID, String name, String description, String color) {
        new GommetteDAO().modifyGommette(ID, name, description, color);
    }
    
    public static void deleteGommette(int id) {
        new GommetteDAO().deleteGommette(id);
    }
}
