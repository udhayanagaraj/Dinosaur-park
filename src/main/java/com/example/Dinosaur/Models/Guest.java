package com.example.Dinosaur.Models;

public class Guest {
    String name;
    int id;
    int age;
    String gender;
    String entryTime;
    boolean isVip;

    public Guest(String name, int id, int age, String gender, String entryTime, boolean isVip) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.entryTime = entryTime;
        this.isVip = isVip;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "entryTime='" + entryTime + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
