package com.example.Dinosaur.Controllers;

import com.example.Dinosaur.Models.Guest;
import com.example.Dinosaur.Models.Ticket;

import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.Logger;

public class GuestController {
    private static final Logger logger = Logger.getLogger(GuestController.class.getName());
    Scanner scanner = new Scanner(System.in);
    private final Map<String,Guest> guestMap = new HashMap<>();


    public void displayMenu() {
        int choice = -1;

        while(choice != 0) {
            System.out.println("Press 1 to add");
            System.out.println("Press 2 to update");
            System.out.println("Press 3 to list");
            System.out.println("Press 4 to search");
            System.out.println("Press 5 to delete");
            System.out.println("Press 0 to exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exited...");
                    break;
                case 1:
                    addGuest();
                    break;
                case 2:
                    System.out.println("Enter the guest id: ");
                    String empId = scanner.nextLine();
                    updateGuest(empId);
                    break;
                case 3:
                    getAllGuests();
                    break;
                case 4:
                    System.out.println("Enter the guest id: ");
                    String searchId = scanner.nextLine();
                    getGuest(searchId);
                    break;
                case 5:
                    System.out.println("enter the guest id: ");
                    String deleteId = scanner.nextLine();
                    removeGuest(deleteId);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void addGuest(){
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Is vip: ");
        String isVip = scanner.nextLine();
        String id = UUID.randomUUID().toString();

        Guest guest = new Guest(name, id,age,gender,new Ticket(UUID.randomUUID().toString(),LocalDateTime.now().toString()),Boolean.getBoolean(isVip));
        guestMap.put(id,guest);

        System.out.println("Guest added successfully");
    }


    public Optional<Guest> getGuest(String id){
        try {
           Guest guest = guestMap.get(id);
           if(guest == null){
               System.out.println("Guest not found with id: "+id);
               return Optional.empty();
           }
           return Optional.of(guest);
        } catch (Exception e) {
            logger.severe("Error occurred while retrieving guest: " + e.getMessage());
            throw new RuntimeException("Error retrieving guest", e);
        }
    }

    public void getAllGuests(){
        try{
            System.out.println(guestMap);
        }catch (Exception e){
            logger.severe("Error occurred while retrieving guests: "+e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public boolean removeGuest(String id){
        try {
            Guest removedGuest = guestMap.remove(id);
            if(removedGuest == null){
                System.out.println("Guest not found with id: "+id);
                return false;
            }
            return true;
        } catch (Exception e) {
            logger.severe("Error occurred while retrieving guest: " + e.getMessage());
            throw new RuntimeException("Error removing guest with ID: " + id, e);
        }
    }

    public Optional<Guest> updateGuest(String id) {
        try {
            Guest guest = guestMap.get(id);
            if (guest == null) {
                logger.warning("Guest not found with ID: " + id);
                return Optional.empty();
            }

            System.out.println("Enter the name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the gender: ");
            String gender = scanner.nextLine();
            System.out.println("Is vip: ");
            String isVip = scanner.nextLine();

            guest.setName(name);
            guest.setAge(age);
            guest.setGender(gender);
            guest.setVip(Boolean.getBoolean(isVip));

            guestMap.put(id, guest);
            return Optional.of(guest); // Return the updated guest
        } catch (Exception e) {
            logger.severe("Error occurred while updating guest: " + e.getMessage());
            throw new RuntimeException("Error updating guest with ID: " + id, e);
        }
    }




}
