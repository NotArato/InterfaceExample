package edu.handong.csee.java.example.keyboard.characters;

public class Rectangle extends ShapeBasics implements RectangleInterface {

	// The height and width of the rectangle.
	private int height;
	private int width;

	// Constructs a rectangle with the specified offset, height, and width.
	public Rectangle() {
		super();
		height = 0;
		width = 0;
	}

	// Constructs a rectangle with the specified offset, height, and width.
	public Rectangle(int theOffset, int theHeight, int theWidth) {
		super(theOffset);
		height = theHeight;
		width = theWidth;
	}

	// Sets the height and width of the rectangle.
	@Override
	public void set(int newHeight, int newWidth) {
		height = newHeight;
		width = newWidth;
	}

	// Draws the rectangle.
	private void drawHorizontalLine()
	{
		skipSpaces(getOffset());
		for (int count = 0; count < width; count++)
			System.out.print('-');
		System.out.println();
	}
	
	// Draws the sides of the rectangle.
	private void drawSides() {
		for (int count = 0; count < (height - 2); count++)
			drawOneLineOfSides();
	}
	
	// Draws the rectangle.
	 public void drawHere()
	 {
	     drawHorizontalLine();
	     drawSides();
	     drawHorizontalLine();
	 }
	
	 // Draws one line of the sides of the rectangle.
	private void drawOneLineOfSides() {
		skipSpaces(getOffset());
		System.out.print('|');
		skipSpaces(width - 2);
		System.out.println('|');
	}
	
	//Writes the indicated number of spaces.
	private static void skipSpaces(int number)
	{
		for (int count = 0; count < number; count++)
			System.out.print(' ');
	}
}
