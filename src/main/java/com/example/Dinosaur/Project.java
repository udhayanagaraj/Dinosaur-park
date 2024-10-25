package com.example.Dinosaur;

import com.example.Dinosaur.Controllers.DinosaurController;
import com.example.Dinosaur.Controllers.EmployeeController;
import com.example.Dinosaur.Controllers.GuestController;

import java.util.Scanner;

public class Project {

//
//    public void addEmployee(){
//        String name;
//        int age;
//    }
//
//    public void dinosaurProfile(String name,int age,String species,String diet,double weight){
//        System.out.println("Meet "+name+", a "+age+" year-old "+species+". As a "+diet+" it has a robust weight of "+weight+" Kilograms");
//    }
//
//    void averageWeightOfTwoDinosaurs(double w1,double w2){
//        double w = (w1 + w2) / 2;
//        System.out.println("Average: "+w);
//    }
//
//    int foodRequired(double weight){
//        if(weight > 500){
//            return 5;
//        } else if (700 < weight) {
//            return 6;
//        } else if (weight > 1000) {
//            return 8;
//        }
//
//        return 0;
//    }
//
//    boolean isLeapYear(int year){
//        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//    }
//
//    boolean isMaximumCapacityReached(int capacity,int maxCapacity){
//        return capacity >= maxCapacity;
//    }
//
//
//    int ageDifference(int age1,int age2){
//        return Math.abs(age1 - age2);
//    }
//
//    boolean safetyThreshold(int rating){
//        return rating >= 8;
//    }
//
//
//    static int mealPortion(int weight,int proportion){
//        return  (weight * proportion) / 100;
//    }
//
//    static void mealPortionResult(int weight,int proportion,int feedingCount){
//        int v = mealPortion(weight,proportion);
//
//        int perCount = v / feedingCount;
//
//        System.out.println("Our "+weight+" kg dinosaur needs to eat "+v+"kg daily, which means we need to serve "+perCount+"kg per feeding");
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mesozoic Eden");
        System.out.println("Park opens from 08:00 to 20:00");
        System.out.println("Mesozoic Eden is safe and secure");

        int choice = -1;

        while(choice != 0) {
            System.out.println("Enter 1 to dino operations");
            System.out.println("Enter 2 for employee operations");
            System.out.println("Enter 3 for guest operations");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exited...");
                    break;
                case 1:
                    DinosaurController dinosaurController = new DinosaurController();
                    dinosaurController.displayMenu();
                    break;
                case 2:
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.displayMenu();
                    break;
                case 3:
                    GuestController guestController = new GuestController();
                    guestController.displayMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
//        mealPortionResult(2000,5,2);
        }
    }
}
