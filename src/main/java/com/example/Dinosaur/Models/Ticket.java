package com.example.Dinosaur.Models;

public class Ticket {
    String id;
    String createdAt;

    public Ticket(String id, String createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
