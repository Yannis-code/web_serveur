package com.uca.core;

import com.uca.dao.*;
import com.uca.entity.*;

import java.util.ArrayList;

public class ClassCore {

    public static ArrayList<ClassEntity> getAllClasses() {
        return new ClassDAO().getAllClasses();
    }
}
