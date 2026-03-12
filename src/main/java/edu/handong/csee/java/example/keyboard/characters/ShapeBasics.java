package edu.handong.csee.java.example.keyboard.characters;

public class ShapeBasics implements ShapeInterface {

	private int offset;

	public ShapeBasics() {	// Set the offset to 0
		offset = 0;
	}

	public ShapeBasics(int theOffset) {	// Set the offset to the value specified by theOffset
		offset = theOffset;
	}

	@Override
	public void setOffset(int newOffset) {	// Set the offset to the new value
		offset = newOffset;
	}

	@Override
	public int getOffset() {	// Return the offset
		return offset;
	}

	@Override
	public void drawAt(int lineNumber) {	// Draw the shape at the line number specified by lineNumber
		for (int count = 0; count < lineNumber; count++)
			System.out.println();
		drawHere();
	}

	@Override
	public void drawHere() {	// Draw the shape at the current line
		for (int count = 0; count < offset; count++)
			System.out.print(' ');
		System.out.println('*');
	}

}
