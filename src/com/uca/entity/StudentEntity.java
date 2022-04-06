package com.uca.entity;

import java.sql.Timestamp;

public class StudentEntity extends UserEntity{
    private int id;
    private String classe;

    public getId(){
        return this.id;
    }

    public setId(int id){
        this.id = id;
    }

    public getClasse(){
        return this.classe;
    }

    public setClasse(String classe){
        this.classe = classe;
    }
    
}