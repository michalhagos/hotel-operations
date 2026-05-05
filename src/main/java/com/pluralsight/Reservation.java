package com.pluralsight;

public class Reservation {

    public String RoomType;

    public int numberOfNights;

    public boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        RoomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
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

    public double getPrice () {
       //if (this.getRoomType()==);


    }


}

