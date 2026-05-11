package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchOut_should_addHoursWorked() {
        // arrange
        Employee employee = new Employee(1, "Nobel", "Front Desk", 55.00, 0);
        int expectedHours = 8;
        // act
        employee.punchIn(9);
        employee.punchOut(17);
        // assert
        assertEquals(expectedHours, employee.getHoursWorked());
    }

    @Test
    public void punchOut_should_accumulateHours_overMultipleShifts() {
        // arrange
        Employee employee = new Employee(1, "Nobel", "Front Desk", 55.00, 0);
        int expectedHours = 12;
        // act
        employee.punchIn(9);
        employee.punchOut(17);
        employee.punchIn(10);
        employee.punchOut(14);
        // assert
        assertEquals(expectedHours, employee.getHoursWorked());
    }

    @Test
    public void punchOut_should_calculateCorrectly_forShortShift() {
        // arrange
        Employee employee = new Employee(1, "Nobel", "Front Desk", 55.00, 0);
        int expectedHours = 4;
        // act
        employee.punchIn(8);
        employee.punchOut(12);
        // assert
        assertEquals(expectedHours, employee.getHoursWorked());
    }


    @Test
    public void punchOut_should_addToExistingHours() {
        // arrange
        Employee employee = new Employee(1, "Nobel", "Front Desk", 55.00, 40);
        double expectedHours = 48;
        // act
        employee.punchIn(9);
        employee.punchOut(17);
        // assert
        assertEquals(expectedHours, employee.getHoursWorked());
    }











}