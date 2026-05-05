package com.pluralsight;

// create an Employee Class
public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // just creating this to store the time
    public int punchInTime;


// create a constructor

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
// create getters and setters

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    // getRegularHours() getting the regular hours
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    // getOvertimeHours() calculates the overtime hours by subtracting from 40
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }

    // calculate the total pay
    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }


    public void punchIn(int time ){
      this.punchInTime = time;
    }

    // figure out the differenc between the punch out and in time and to add that to employees hours worked
    public void punchOut(int time ){
        //this.punchOutTime = time;


    }












}