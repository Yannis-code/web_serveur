package com.uca;

import com.uca.dao._Initializer;
import com.uca.gui.*;
import com.uca.core.*;

import static spark.Spark.*;

public class StartServer {

    public static void main(String[] args) {
        //Configure Spark
        staticFiles.location("/static/");
        port(8081);


        _Initializer.Init();

        //Defining our routes
        get("/students", (req, res) -> {
            return StudentGUI.getAllStudents();
        });

        get("/gommettes", (req, res) -> {
            return GommetteGUI.getAllGommettes();
        });

        get("/students/:idStudent/gommettes", (req, res) -> {
            return StudentGommetteGUI.getStudentGommettes(Integer.parseInt(req.params(":idStudent")));
        });

        get("/teachers", (req, res) -> {
            return TeacherGUI.getAllTeachers();
        });

        get("/login", (req, res) -> {
            return TeacherGUI.getLogin();
        });

        get("/students/:idStudent/delete", (req, res) -> {
            StudentCore.deleteStudent(Integer.parseInt(req.params(":idStudent")));
            res.redirect("/students");
            return null;
        });

        // /students
        // 


    }
}