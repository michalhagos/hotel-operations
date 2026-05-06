package com.pluralsight;

// create a room Class
public class Room {
    // create the fields or properties of the class
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    // create a constructor to help for building new objects
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }
// create getters and

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;

    }

    // this is a calculated getter which checks if the room is available if it is not occupied or dirty
    public boolean isAvailable() {
        return !this.isDirty() && !this.isOccupied();

    }

    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void cleanRoom() {
        this.isDirty = false;

    }

    public void checkOut() {
        this.cleanRoom();
        this.isOccupied = false;



    }


}
// public boolean isAvailable() {
//    if (!this.isDirty() && !this.isOccupied()){
//    return true;

//    }
// return false;
//
//    }
//
//
