package com.example.Dinosaur.Controllers;

import com.example.Dinosaur.Models.Dinosaur;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class DinosaurController {
    ArrayList<Dinosaur> dinoList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void displayMenu(){
        int choice = -1;

        while(choice != 0) {
            System.out.println("Press 1 to add");
            System.out.println("Press 2 to update");
            System.out.println("Press 3 to list");
            System.out.println("Press 4 to search");
            System.out.println("Press 5 to delete");
            System.out.println("Press 0 to exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exited...");
                    break;
                case 1:
                    addDinosaur();
                    break;
                case 2:
                    System.out.println("Enter the dino id: ");
                    String id = scanner.nextLine();
                    updateDinosaurs(id);
                    break;
                case 3:
                    listDinosaurs();
                    break;
                case 4:
                    System.out.println("Enter the dino id: ");
                    String searchId = scanner.nextLine();
                    getDinosaur(searchId);
                    break;
                case 5:
                    System.out.println("Enter the dino id: ");
                    String deleteId = scanner.nextLine();
                    deleteDino(deleteId);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void addDinosaur(){
        System.out.println("Enter the id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the species: ");
        String species = scanner.nextLine();
        System.out.println("Enter the type: ");
        String type = scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the feedingProportion: ");
        int feedingProportion = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the feeding times: ");
        String feedingTimes = scanner.nextLine();
        System.out.println("Enter the enclosure no: ");
        String enclosureNo = scanner.nextLine();


        Dinosaur dinosaur = new Dinosaur(UUID.randomUUID().toString(),name, age, species, type, gender, enclosureNo, weight, height, feedingProportion, feedingTimes.split(" "));
        dinoList.add(dinosaur);

        System.out.println("Dinosaur added successfully");
    }

    public void listDinosaurs(){
        System.out.println(dinoList);
    }

    public void getDinosaur(String id){
        Dinosaur dinosaur = null;

        for(Dinosaur d : dinoList){
            if(d.getId().equals(id)){
                dinosaur = d;
            }
        }
        if(dinosaur == null){
            System.out.println("Dinosaur with id: "+id+" is not found");
            return;
        }

        System.out.println(dinosaur);
    }

    public void updateDinosaurs(String id){
        Dinosaur dinosaur = null;
        for (Dinosaur d : dinoList){
            if(d.getId().equals(id)){
                dinosaur = d;
                break;
            }
        }

        if(dinosaur != null){
            System.out.println("Updating dinosaur with id:  "+dinosaur.getId());
            System.out.println("Which attribute would you like to update?");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Species");
            System.out.println("4. Type");
            System.out.println("5. Gender");
            System.out.println("6. Weight");
            System.out.println("7. Height");
            System.out.println("8. Feeding Proportion");
            System.out.println("9. Feeding Times");
            System.out.println("10. Enclosure No");
            System.out.print("Enter the number of the attribute you want to update: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter new name (current:  "+dinosaur.getName()+")");
                    String newName = scanner.nextLine();
                    if(!newName.isEmpty())
                        dinosaur.setName(newName);
                    break;
                case 2:
                    System.out.println("Enter new age (current:  "+dinosaur.getAge()+")");
                    int newAge = scanner.nextInt();
                    if(newAge != 0)
                        dinosaur.setAge(newAge);
                    break;
                case 3:
                    System.out.print("Enter new species (current: " + dinosaur.getSpecies() + "): ");
                    String species = scanner.nextLine();
                    if (!species.isEmpty()) {
                        dinosaur.setSpecies(species);
                    }
                    break;
                case 4:
                    System.out.print("Enter new type (current: " + dinosaur.getType() + "): ");
                    String type = scanner.nextLine();
                    if (!type.isEmpty()) {
                        dinosaur.setType(type);
                    }
                    break;
                case 5:
                    System.out.print("Enter new gender (current: " + dinosaur.getGender() + "): ");
                    String gender = scanner.nextLine();
                    if (!gender.isEmpty()) {
                        dinosaur.setGender(gender);
                    }
                    break;
                case 6:
                    System.out.print("Enter new weight (current: " + dinosaur.getWeight() + "): ");
                    String weightInput = scanner.nextLine();
                    if (!weightInput.isEmpty()) {
                        dinosaur.setWeight(Double.parseDouble(weightInput));
                    }
                    break;
                case 7:
                    System.out.print("Enter new height (current: " + dinosaur.getHeight() + "): ");
                    String heightInput = scanner.nextLine();
                    if (!heightInput.isEmpty()) {
                        dinosaur.setHeight(Double.parseDouble(heightInput));
                    }
                    break;
                case 8:
                    System.out.print("Enter new feeding proportion (current: " + dinosaur.getFeedingProportion() + "): ");
                    String feedingProportionInput = scanner.nextLine();
                    if (!feedingProportionInput.isEmpty()) {
                        dinosaur.setFeedingProportion(Integer.parseInt(feedingProportionInput));
                    }
                    break;
                case 9:
                    System.out.print("Enter new feeding times (current: " + String.join(", ", dinosaur.getFeedingTimes()) + "): ");
                    String feedingTimes = scanner.nextLine();
                    if (!feedingTimes.isEmpty()) {
                        dinosaur.setFeedingTimes(feedingTimes.split(" "));
                    }
                    break;
                case 10:
                    System.out.print("Enter new enclosure number (current: " + dinosaur.getEnclosure() + "): ");
                    String enclosureNo = scanner.nextLine();
                    if (!enclosureNo.isEmpty()) {
                        dinosaur.setEnclosure(enclosureNo);
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    public void deleteDino(String id){
        Dinosaur dinosaur = null;

        for(Dinosaur d : dinoList){
            if(d.getId().equals(id)){
                dinosaur =  d;
            }
        }

        if(dinosaur == null){
            System.out.println("Dino with "+id+" not found");
            return;
        }

        dinoList.remove(dinosaur);

    }
}
