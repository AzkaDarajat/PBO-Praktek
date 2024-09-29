package com.jtk.polban.pbo.pertemuan6.exercise1;
import com.jtk.polban.pbo.pertemuan6.exercise1.*;

public class TestCylinder { // save as "TestCylinder.java"
    public static void main (String[] args) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume()
                + " color=" + c1.getColor("white"));

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume()
                + " color=" + c2.getColor("yellow"));

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume()
                + " color=" + c3.getColor("blue"));

        Cylinder c4 = new Cylinder(7.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c4.getRadius()
                + " height=" + c4.getHeight()
                + " base areas=" + c4.getArea()
                + " Volume=" + c4.getVolume()
                + " color=" + c4.getColor("red")
                + " ToString" + c4.gettoString()
        );
    }
}

