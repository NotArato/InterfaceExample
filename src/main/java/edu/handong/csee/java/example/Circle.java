package edu.handong.csee.java.example;

public class Circle implements Measurable {
	private double myRadius;
	
	// Constructor
	public Circle(double radius) {
		myRadius = radius;
	}
	
	// Getters and Setters
	public double getPerimeter() {
		return 2 * Math.PI * myRadius;
	}
	
	// Since circumference is the same as perimeter for a circle, we can reuse the getPerimeter method
	public double getCircumference() {
		return getPerimeter();
	}
	
	// Implementing the getArea method from the Measurable interface
	public double getArea() {
		return Math.PI * myRadius * myRadius;
	}
}

