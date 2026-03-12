package edu.handong.csee.java.example.keyboard.characters;

public class ShapeBasics implements ShapeInterface {

	private int offset;

	// Constructors
	public ShapeBasics() {
		offset = 0;
	}

	// Constructors
	public ShapeBasics(int theOffset) {
		offset = theOffset;
	}

	@Override
	public void setOffset(int newOffset) {
		offset = newOffset;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public void drawAt(int lineNumber) {
		for (int count = 0; count < lineNumber; count++)
			System.out.println();
		drawHere();
	}

	@Override
	public void drawHere() {
		for (int count = 0; count < offset; count++)
			System.out.print(' ');
		System.out.println('*');
	}

}
