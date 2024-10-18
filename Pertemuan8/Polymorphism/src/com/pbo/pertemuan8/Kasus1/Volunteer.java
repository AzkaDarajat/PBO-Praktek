package com.pbo.pertemuan8.Kasus1;

class Volunteer extends StaffMember {
    // Constructor
    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public double pay() {
        return 0.0;
    }
}
