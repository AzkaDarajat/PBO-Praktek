package com.jtk.polban.pbo.pertemuan6.exercise2;

public class Main {
    public static void main(String [] args) {
        // Pembuktian dari beberapa constructor disini shape ada 2 constructor
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(5);
        System.out.println(circle2);

        Circle circle3 = new Circle(10, "yellow", false);
        System.out.println(circle3);

        // Pembuktian dari beberapa constructor dimana disini rectangle memiliki 3 constructor
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        // Hanya menggunakan lebar dan panjang
        Rectangle rectangle2 = new Rectangle(3, 3);
        System.out.println(rectangle2);

        // Menggunakan super dari shape
        Rectangle rectangle3 = new Rectangle(6, 6, "green", false);
        System.out.println(rectangle3);

        // Pembuktian dari beberapa constructor dimana disini square memiliki 3 constructor
        Square square1 = new Square();
        System.out.println(square1);

        // Hanya menggunakan parameter untuk sisi (panjang == lebar)
        Square square2 =  new Square(2);
        System.out.println(square2);

        // Menggunakan super dari shape
        Square square3 = new Square(3, "yellow", true);
        System.out.println(square3);
    }
}
