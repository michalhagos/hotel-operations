package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 149.99, false, false);
        System.out.println("Available: " + room1.isAvailable());

        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Total: " + String.format("%.2f",reservation1.getReservationTotal()));

        Employee employee1 = new Employee(1, "Nobel", "Front Desk", 55.00, 45);
        System.out.println("Total Pay: " + String.format("%.2f",employee1.getTotalPay()));


        // Option 1: manual times (for testing) . 8 hours added
        employee1.punchIn(9);
        employee1.punchOut(17);

// Option 2: real clock (would use the current hour right now) . grabs LocalTime.now() automatically
        employee1.punchIn();
        employee1.punchOut();

// Option 3: bonus — one call does both , 4 hours added in one line
        employee1.punchTimeCard(10, 14);


    }
}
