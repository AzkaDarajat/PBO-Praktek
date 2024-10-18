package com.pbo.pertemuan8.Kasus2;

public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350); // Coverage in square feet per gallon

        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double deckAmount = paint.amount(deck);
        double ballAmount = paint.amount(bigBall);
        double tankAmount = paint.amount(tank);

        System.out.println("Total deck: " + deckAmount);
        System.out.println("Total big ball: " + ballAmount);
        System.out.println("Total tank: " + tankAmount);
    }
}

