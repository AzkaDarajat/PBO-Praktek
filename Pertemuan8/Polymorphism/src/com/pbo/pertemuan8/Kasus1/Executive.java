package com.pbo.pertemuan8.Kasus1;

class Executive extends Employee {
    private double bonus;

    // Constructor
    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        bonus = 0.0;
    }

    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0; // Reset bonus after paying
        return payment;
    }
}
