package com.pbo.pertemuan8.Kasus1;

abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    // Constructor
    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public abstract double pay();

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }
}