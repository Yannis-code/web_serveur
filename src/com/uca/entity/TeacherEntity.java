package com.uca.entity;

import java.sql.Timestamp;

public class TeacherEntity extends UserEntity{
    private String username;
    private int id;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }
    
}