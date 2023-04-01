package com.example.pp_3_1_2_springbootcrud.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    @Column
    @NotEmpty(message = "Name не должно быть пустым")
    @Size(min = 2, max = 30, message = "Name в этом эквиваленте")
    private String name;

    @Column
    @NotEmpty(message = "Surname не должно быть пустым")
    @Size(min = 2, max = 30, message = "Surname в этом эквиваленте")
    private String surname;

    @Column
    @Min(value = 0, message = "Age should be greater than 0")
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
