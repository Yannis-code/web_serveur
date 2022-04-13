package com.uca.entity;

import java.sql.Timestamp;

import com.uca.entity.GommetteEntity;
import com.uca.entity.StudentEntity;
import com.uca.entity.TeacherEntity;

public class StudentGommetteEntity{
    private int id;
    private int idGommette;
    private int idStudent;
    private int idTeacher;
    private String reason;

    private TeacherEntity teacher;
    private StudentEntity student;
    private GommetteEntity gommette;


    
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
    public TeacherEntity getTeacher() {
        return teacher;
    }
    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }
    public StudentEntity getStudent() {
        return student;
    }
    public void setStudent(StudentEntity student) {
        this.student = student;
    }
    public GommetteEntity getGommette() {
        return gommette;
    }
    public void setGommette(GommetteEntity gommette) {
        this.gommette = gommette;
    }

    

    

}