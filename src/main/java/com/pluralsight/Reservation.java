package com.pluralsight;

// create reservation class
public class Reservation {
 // write  the properties of the class
    public String roomType;

    public int numberOfNights;

    public boolean isWeekend;

    // create a constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    // create setters and getters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    // this are my derived or calculated getters
// calculate the price using an if statement
    public double getPrice() {
        double basePrice;
        if (this.getRoomType().equalsIgnoreCase("King")) {
            basePrice = 139.00;
        } else {
            basePrice = 124.00;

        }
        if (isWeekend) {

            basePrice = basePrice + (basePrice * 0.1);
        }
        return basePrice;


    }
    // calculated or derived getter
// calculate the total by multiplying the base price with the number of nights
    public double getReservationTotal() {
        return this.getPrice() * this.numberOfNights;

    }
}

