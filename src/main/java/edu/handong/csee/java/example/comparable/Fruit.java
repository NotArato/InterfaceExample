package edu.handong.csee.java.example.comparable;

public class Fruit implements Comparable<Fruit> {
	private String fruitName;

	public Fruit() {	// default constructor
		fruitName = "";
	}

	public Fruit(String name) {	// constructor
		fruitName = name;
	}

	public void setName(String name) {	// setter
		fruitName = name;
	}

	public String getName() {	// getter
		return fruitName;
	}

	@Override
	public int compareTo(Fruit otherFruit) {	// compareTo method to sort fruits by their names in alphabetical order
		return (fruitName.compareTo(otherFruit.fruitName));
	}

	/*
	@Override
	public int compareTo(Fruit otherFruit) {

		if(fruitName.length() > otherFruit.fruitName.length())
			return 1;
		else if (fruitName.length() < otherFruit.fruitName.length())
			return -1;
		else
			return 0;
	}
	 */
}
