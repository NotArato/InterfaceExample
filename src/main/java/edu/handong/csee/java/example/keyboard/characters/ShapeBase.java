package edu.handong.csee.java.example.keyboard.characters;

public abstract class ShapeBase implements ShapeInterface {

	private int offset;

	// constructors
	public ShapeBase() {
		offset = 0;
	}

	// constructors
	public ShapeBase(int theOffset) {
		offset = theOffset;
	}

	// methods
	@Override
	public void setOffset(int newOffset) {
		offset = newOffset;
	}

	// methods
	@Override
	public int getOffset() {
		return offset;
	}

	// methods
	@Override
	public void drawAt(int lineNumber) {
		for (int count = 0; count < lineNumber; count++)
			System.out.println();
		drawHere();
	}

	@Override
	public abstract void drawHere();

}
