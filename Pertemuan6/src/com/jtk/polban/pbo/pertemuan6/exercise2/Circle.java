package com.jtk.polban.pbo.pertemuan6.exercise2;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle dengan radius = " + radius + " dengan hasil perhitungan area = " + getArea() + " hasil perimeter = " + getPerimeter() +" subclass of " + super.toString();
    }
}


