package com.pbo.pertemuan8.Kasus1;

class Hourly extends Employee {
    private int hoursWorked;

    // Constructor
    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        hoursWorked = 0;
    }

    public void addHours(int hours) {
        hoursWorked += hours;
    }

    @Override
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0; // Reset hours worked after calculating pay
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHours Worked: " + hoursWorked;
    }
}

