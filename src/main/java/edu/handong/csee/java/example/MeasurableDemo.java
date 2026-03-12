package edu.handong.csee.java.example;

public class MeasurableDemo {
    public static void main(String[] args) {
        // create a rectangle print their areas and perimeters
        Measurable a = new Rectangle(100, 200);
        System.out.println("a.getArea() = " + a.getArea());
        System.out.println("a.getPerimeter() = " + a.getPerimeter());
        
// create a circle print their areas and perimeters
        Measurable b = new Circle(5);
        System.out.println("b.getArea() = " + b.getArea());
        System.out.println("b.getPerimeter() = " + b.getPerimeter());
    }
}