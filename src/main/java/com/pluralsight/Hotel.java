package com.pluralsight;

public class Hotel {
    // create the properties for the Hotel Class
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;

        //default these to 0  when creating a brand-new hotel reservation
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    // --- Getters only, no setters needed because we don't need to update

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
//  derived getter or calculated ones
    // a method that calculates the available suites by subtracting the number of suites to the booked ones
public int getAvailableSuites() {
    return numberOfSuites - bookedSuites;

}// a method that calculates the available rooms by subtracting the number of rooms to the booked rooms
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }






}
