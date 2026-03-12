package edu.handong.csee.java.example.comparable.without;

public class Fruit {
	private String fruitName;
	
	// constructor
	public Fruit() {
		fruitName = "";
	}
	
	// constructor with parameter
	public Fruit(String name) {
		fruitName = name;
	}
	
	// getter and setter
	public void setName(String name) {
		fruitName = name;
	}
	
	// getter
	public String getName() {
		return fruitName;
	}
}
