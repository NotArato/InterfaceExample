package edu.handong.csee.java.example;

public class Rectangle implements Measurable {
	// Instance variables
	private double myWidth;
	private double myHeight;
	
	// Constructor
	public Rectangle(double width, double height) {
		myWidth = width;
		myHeight = height;
	}
	
	// Implementing methods from Measurable interface
	public double getPerimeter() {
		return 2 * (myWidth + myHeight);
	}
	 
	// Implementing methods from Measurable interface
	public double getArea() {
		return myWidth * myHeight;
	}
}
