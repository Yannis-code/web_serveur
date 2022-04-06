package com.uca.entity;

import java.sql.Timestamp;

public abstract class UserEntity {
    private String firstName;
    private String lastName;


    public UserEntity() {
        //Ignored !
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
