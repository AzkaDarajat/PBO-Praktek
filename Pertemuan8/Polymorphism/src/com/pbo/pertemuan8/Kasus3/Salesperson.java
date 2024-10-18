package com.pbo.pertemuan8.Kasus3;

public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }

    @Override
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales; // Descending order by total sales
        } else {
            return other.lastName.compareTo(this.lastName); // Reverse alphabetical order
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}

