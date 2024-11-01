package org.example;

public class Airport {
    public static void main(String[] args) {
        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");

        Passenger james = new Passenger("James", true);
        Passenger azka = new Passenger("Azka", true);
        Passenger radja = new Passenger("Radja", true);
        Passenger mike = new Passenger("Mike", false);
        Passenger farhan = new Passenger("Farhan", false);
        Passenger aga = new Passenger("Bandyaga", false);

        businessFlight.addPassenger(james);
        businessFlight.addPassenger(azka);
        businessFlight.addPassenger(radja);
        businessFlight.removePassenger(james);
        businessFlight.addPassenger(mike);
        economyFlight.addPassenger(mike);
        economyFlight.addPassenger(farhan);
        economyFlight.addPassenger(aga);

        System.out.println("Business flight passengers list:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }

        System.out.println("Economy flight passengers list:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }
}


