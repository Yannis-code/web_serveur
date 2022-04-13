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
            return TeacherGUI.getAllStudents();
        });

        get("/gommettes", (req, res) -> {
            return StudentGUI.getAllGommettes();
        });

        get("/students/:idStudent/gommettes", (req, res) -> {
            return StudentGUI.getStudentGommettes(Integer.parseInt(req.params(":idStudent")));
        });

        get("/teachers", (req, res) -> {
            return TeacherGUI.getAllTeachers();
        });

        get("/login", (req, res) -> {
            return StudentGUI.getLogin();
        });

        post("/login", (req, res) -> {
            String nameParam = req.queryParams("name");
            String pswrParam = req.queryParams("password");
            if(LoginCore.authentificate(nameParam, pswrParam)) {
                req.session().attribute(nameParam, pswrParam);
                res.redirect("/teachers");
            } else {
                res.redirect("/login");
            }
            return StudentGUI.getLogin();
        });

        delete("/students", (req, res) -> {
            String test = req.queryParams("id");
            // System.out.println(test);
            // TODO StudentCore
            StudentCore.deleteStudent(Integer.parseInt(test));
            // TeacherGUI.deleteStudent(Integer.parseInt(test));
            // return TeacherGUI.getAllStudents();
            return null;
        });

        // /students
        // 


    }
}