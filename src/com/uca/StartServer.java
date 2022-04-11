package com.uca;

import com.uca.dao._Initializer;
import com.uca.gui.*;

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
            return StudentGUI.getStudentGommettes(Integer.parseInt(req.params(":idStudent" )));
        });
    }
}