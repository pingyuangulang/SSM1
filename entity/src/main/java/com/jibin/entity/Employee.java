package com.jibin.entity;

import java.util.Date;

public class Employee {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private Date inTime;
    private Date outTime;

    public Employee() {}

    public Employee(String name, String gender, Integer age, Date inTime, Date outTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    public Employee(Integer id, String name, String gender, Integer age, Date inTime, Date outTime) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.inTime = inTime;
        this.outTime = outTime;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                '}';
    }
}
