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































}