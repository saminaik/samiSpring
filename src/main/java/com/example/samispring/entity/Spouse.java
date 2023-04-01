package com.example.samispring.entity;

import javax.persistence.*;

@Entity
@Table(name="spouse")
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mobileNUmber;
    private int age;
    @OneToOne(mappedBy="spouse")
      Employee employee;


    public Spouse(String name, String mobileNUmber, int age) {
        this.name = name;
        this.mobileNUmber = mobileNUmber;
        this.age = age;
    }

    public Spouse() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNUmber() {
        return mobileNUmber;
    }

    public void setMobileNUmber(String mobileNUmber) {
        this.mobileNUmber = mobileNUmber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
