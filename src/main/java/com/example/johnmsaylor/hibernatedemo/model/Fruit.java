package com.example.johnmsaylor.hibernatedemo.model;

import javax.persistence.*;

@Entity
@Table(name="fruits")
public class Fruit {

    @Id
    @GeneratedValue
    @Column(name= "id")
    public Integer id;

    @Column(name = "name")
    public String name;

    public Fruit(){}

    public Fruit(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
