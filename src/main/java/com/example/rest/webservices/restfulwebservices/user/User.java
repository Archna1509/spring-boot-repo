package com.example.rest.webservices.restfulwebservices.user;

import jakarta.persistence.Id;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

public class User {

    private Integer id;
    private String name;
    private LocalDate birthDate;

    public User() {
    }

    public User(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


}
