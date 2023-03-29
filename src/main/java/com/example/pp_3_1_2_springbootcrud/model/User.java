package com.example.pp_3_1_2_springbootcrud.model;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Поле должно содержать только буквы")
    private String name;

    @Column
    @Pattern(regexp = "^[a-zA-Zа-яА-Я]+$", message = "Поле должно содержать только буквы")
    private String surname;

    @Column
    @PositiveOrZero
    @Min(value=10,message = "возраст не может быть меньше 10")
    @Max(value=100,message = "возраст не может быть больше 100")
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
