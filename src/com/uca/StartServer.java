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

        post("/login", (req, res) -> {
            String nameParam = req.queryParams("name");
            String pswrParam = req.queryParams("password");
            if(LoginCore.authentificate(nameParam, pswrParam)) {
                req.session().attribute(nameParam, pswrParam);
                res.redirect("/teachers");
            } else {
                res.redirect("/login");
            }
            return TeacherGUI.getLogin();
        });

        get("/students/:idStudent/delete", (req, res) -> {
            StudentCore.deleteStudent(Integer.parseInt(req.params(":idStudent")));
            res.redirect("/students");
            return null;
        });

        get("/gommettes/:idGommette/delete", (req, res) -> {
            GommetteCore.deleteGommette(Integer.parseInt(req.params(":idGommette")));
            res.redirect("/gommettes");
            return null;
        });

        get("/students/:idStudent/gommettes/:id/delete", (req, res) -> {
            StudentGommetteCore.deleteStudentGommette(Integer.parseInt(req.params(":id")));
            res.redirect("/students/" + req.params(":idStudent") + "/gommettes");
            return null;
        });

        get("/studentGommettes", (req, res) -> {
            return StudentGommetteGUI.getAllStudentGommettes();
        });

    }
}