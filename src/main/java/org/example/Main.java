package org.example;

import org.geometry.Cube;
import org.geometry.Sphere;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        int compared = CompareFigures.compareAreas(circle, rectangle);
        if (compared >  0) {
            System.out.println("Circle area is bigger than rectangle area");
        }
        if (compared == 0) {
            System.out.println("Circle area is less than rectangle area");
        }
        if (compared < 0) {
            System.out.println("Circle area equals rectangle area");
        }

        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(4);

        System.out.println("Cube Volume: " + cube.getVolume());
        System.out.println("Cube Surface Area: " + cube.getSurfaceArea());

        System.out.println("Sphere Volume: " + sphere.getVolume());
        System.out.println("Sphere Surface Area: " + sphere.getSurfaceArea());
    }
}