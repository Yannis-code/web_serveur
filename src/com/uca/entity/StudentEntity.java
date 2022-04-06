package com.uca.entity;

import java.sql.Timestamp;

public class StudentEntity extends UserEntity{
    private int id;
    private String classroom;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getClassroom(){
        return this.classroom;
    }

    public void setClassroom(String classroom){
        this.classroom = classroom;
    }
    
}