package com.example.Dinosaur.Controllers;

import com.example.Dinosaur.Models.Dinosaur;
import com.example.Dinosaur.Models.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class EmployeeController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();


    public void displayMenu() {
        int choice = -1;

        while(choice != 0) {
            System.out.println("Press 1 to add");
            System.out.println("Press 2 to update");
            System.out.println("Press 3 to list");
            System.out.println("Press 4 to search");
            System.out.println("Press 0 to exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exited...");
                    break;
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.println("Enter the employee id: ");
                    String empId = scanner.nextLine();
                    scanner.nextLine();
                    updateEmployee(empId);
                    break;
                case 3:
                    listEmployees();
                    break;
                case 4:
                    System.out.println("Enter the dino id: ");
                    String searchId = scanner.nextLine();
                    getEmployee(searchId);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }


    public void addEmployee(){
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the department: ");
        String department = scanner.nextLine();
        System.out.println("Enter the years of experience: ");
        int yearsOfExp = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter reporting to: ");
        int reportingTo = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(name,age,UUID.randomUUID().toString(),department,gender,yearsOfExp, LocalDate.now().toString(),reportingTo);
        employees.add(employee);
        System.out.println("Employee added successfully");
    }

    public void listEmployees(){
        System.out.println(employees);
    }

    public void getEmployee(String id){
        Employee employee = null;

        for(Employee e : employees){
            if(e.getEmpId().equals(id)){
                employee = e;
                break;
            }
        }

        if(employee == null){
            System.out.println("Employee with id: "+id+" is not found");
            return;
        }

        System.out.println(employee);
    }

    public void updateEmployee(String id){
        Employee employee = null;
        for (Employee e : employees){
            if(e.getEmpId().equals(id)){
                employee = e;
                break;
            }
        }

        if(employee != null){
            System.out.println("Updating employee with id:  "+ employee.getEmpId());
            System.out.println("Which attribute would you like to update?");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Gender");
            System.out.println("4. Department");
            System.out.println("5. Years of experience");
            System.out.println("6. Reporting to");
            System.out.print("Enter the number of the attribute you want to update: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter new name (current:  "+employee.getName()+")");
                    String newName = scanner.nextLine();
                    if(!newName.isEmpty())
                        employee.setName(newName);
                    break;
                case 2:
                    System.out.println("Enter new age (current:  "+employee.getAge()+")");
                    int newAge = scanner.nextInt();
                    if(newAge != 0)
                        employee.setAge(newAge);
                    break;
                case 3:
                    System.out.print("Enter new gender (current: " + employee.getGender() + "): ");
                    String gender = scanner.nextLine();
                    if (!gender.isEmpty()) {
                        employee.setGender(gender);
                    }
                    break;
                case 4:
                    System.out.print("Enter new department (current: " + employee.getDepartment() + "): ");
                    String department = scanner.nextLine();
                    if (!department.isEmpty()) {
                        employee.setDepartment(department);
                    }
                    break;
                case 5:
                    System.out.print("Enter new experience (current: " + employee.getYearsOfExp() + "): ");
                    int exp = scanner.nextInt();
                    if (exp != 0) {
                        employee.setYearsOfExp(exp);
                    }
                    break;
                case 6:
                    System.out.print("Enter new reporting to (current: " + employee.getReportingTo()+"):");
                    int reportingTo = scanner.nextInt();
                    if (reportingTo != 0) {
                        employee.setReportingTo(reportingTo);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

}
