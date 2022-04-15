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

        get("/gommettes-teacher", (req, res) -> {
            return GommetteGUI.getAllGommettesTeacher();
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
                res.redirect("/loged");
            } else {
                res.redirect("/login");
            }
            return null;
        });

        post("/students", (req, res) -> {
            String firstname = req.queryParams("firstname");
            String lastname = req.queryParams("lastname");
            String classroom = req.queryParams("classroom");
            StudentCore.createStudent(firstname, lastname, classroom);
            res.redirect("/students");
            return null;
        });

        post("/gommettes-teacher", (req, res) -> {
            String name = req.queryParams("name");
            String description = req.queryParams("description");
            String color = req.queryParams("color");
            GommetteCore.createGommette(name, description, color);
            res.redirect("/gommettes-teacher");
            return null;
        });

        get("/students/:idStudent/delete", (req, res) -> {
            StudentCore.deleteStudent(Integer.parseInt(req.params(":idStudent")));
            res.redirect("/students");
            return null;
        });

        get("/gommettes/:idGommette/delete", (req, res) -> {
            GommetteCore.deleteGommette(Integer.parseInt(req.params(":idGommette")));
            res.redirect("/gommettes-teacher");
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

        get("/", (req, res) -> {
            res.redirect("/index");
            return null;
        });

        get("/index", (req, res) -> {
            return IndexGUI.getIndex();
        });

        get("/loged", (req, res) -> {
            return TeacherGUI.getLoged();
        });

        post("/students/gommettes", (req, res) -> {
            String idStudent = req.queryParams("id");
            res.redirect("/students/" + idStudent + "/gommettes");
            return null;
        });

        post("/students/gommettes/add", (req, res) -> {
            String idStudent = req.queryParams("idStudent");
            String idGommette = req.queryParams("idGommette");
            String reason = req.queryParams("reason");
            StudentGommetteCore.createStudentGommette( "1" ,idStudent, idGommette, reason);
            res.redirect("/loged");
            return null;
        });

        post("/gommettes-teacher/patch", (req, res) -> {
            String ID = req.queryParams("id");
            String name = req.queryParams("name");
            String description = req.queryParams("description");
            String color = req.queryParams("color");
            GommetteCore.modifyGommette(ID, name, description, color);
            res.redirect("/gommettes-teacher");
            return null;
        });

        post("/students/patch", (req, res) -> {
            String ID = req.queryParams("idStudent");
            String firstname = req.queryParams("firstname");
            String lastname = req.queryParams("lastname");
            String classroom = req.queryParams("classroom");
            StudentCore.modifyStudent(ID, firstname, lastname, classroom);
            res.redirect("/students");
            return null;
        });


    }
}