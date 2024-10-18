package com.pbo.pertemuan8.Kasus1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Constructor
    public Commission(String name, String address, String phone, String socialSecurityNumber, double payRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double basePay = super.pay();
        double commissionPay = totalSales * commissionRate;
        totalSales = 0; // Reset total sales after calculating pay
        return basePay + commissionPay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}



