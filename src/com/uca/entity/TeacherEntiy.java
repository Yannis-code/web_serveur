package com.uca.entity;

import java.sql.Timestamp;

public class TeacherEntity extends UserEntity{
    private String username;
    private int id;

    public getId(){
        return this.id;
    }

    public setId(int id){
        this.id = id;
    }

    public getUsername(){
        return this.username;
    }

    public setId(String username){
        this.username = username;
    }
    
}