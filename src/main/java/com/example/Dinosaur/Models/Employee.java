package com.example.Dinosaur.Models;

public class Employee{
    String name;
    int age;
    String id;
    String department;
    String gender;
    int yearsOfExp;
    int reportingTo;
    String joiningDate;

    public Employee(String name, int age, String empId,String gender, String department,int yearsOfExp, String joiningDate,int reportingTo) {
        this.name = name;
        this.age = age;
        this.id = empId;
        this.gender = gender;
        this.department = department;
        this.yearsOfExp = yearsOfExp;
        this.joiningDate = joiningDate;
        this.reportingTo = reportingTo;
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

    public String getEmpId() {
        return id;
    }

    public void setEmpId(String empId) {
        this.id = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public int getReportingTo() {
        return reportingTo;
    }

    public void setReportingTo(int reportingTo) {
        this.reportingTo = reportingTo;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", empId=" + id +
                ", department='" + department + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                ", yearsOfExp=" + yearsOfExp +
                ", reportingTo='" + reportingTo + '\'' +
                '}';
    }
}
