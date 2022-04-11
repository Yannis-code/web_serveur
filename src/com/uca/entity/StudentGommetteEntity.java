package com.uca.entity;

import java.sql.Timestamp;

public class StudentGommetteEntity{
    private int id;
    private int idGommette;
    private int idStudent;
    private int idTeacher;
    private String reason;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdGommette() {
        return idGommette;
    }
    public void setIdGommette(int idGommette) {
        this.idGommette = idGommette;
    }
    public int getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
    public int getIdTeacher() {
        return idTeacher;
    }
    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    

}