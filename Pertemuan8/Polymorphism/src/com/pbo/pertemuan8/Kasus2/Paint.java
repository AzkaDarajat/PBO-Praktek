package com.pbo.pertemuan8.Kasus2;

public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape shape) {
        System.out.println("Perhitungan untuk " + shape);
        return shape.area() / coverage;
    }
}

