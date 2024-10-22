package com.example.Dinosaur.Models;

import java.util.Arrays;

public class Dinosaur {
    int id;
    String name;
    int age;
    String species;
    String type;
    String gender;
    String enclosure;
    double weight;
    double height;
    int feedingProportion;
    String[] feedingTimes;

    public Dinosaur(int id,String name, int age, String species, String type, String gender, String enclosure, double weight, double height, int feedingProportion, String[] feedingTimes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.enclosure = enclosure;
        this.weight = weight;
        this.height = height;
        this.feedingProportion = feedingProportion;
        this.feedingTimes = feedingTimes;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getFeedingProportion() {
        return feedingProportion;
    }

    public void setFeedingProportion(int feedingProportion) {
        this.feedingProportion = feedingProportion;
    }

    public String[] getFeedingTimes() {
        return feedingTimes;
    }

    public void setFeedingTimes(String[] feedingTimes) {
        this.feedingTimes = feedingTimes;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", feedingProportion=" + feedingProportion +
                ", feedingTimes=" + Arrays.toString(feedingTimes) +
                '}';
    }
}



