package com.example.Dinosaur.Models;

public class Guest {
    String name;
    String id;
    int age;
    String gender;
    Ticket ticket;
    boolean isVip;

    public Guest(String name, String id, int age, String gender,Ticket ticket, boolean isVip) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.ticket = ticket;
        this.isVip = isVip;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ticket=" + ticket +
                ", isVip=" + isVip +
                '}';
    }
}
