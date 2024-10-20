package com.pbo.pertemuan8.Kasus1;

class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    // Constructor
    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        return payRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSocial Security Number: " + socialSecurityNumber;
    }
}
