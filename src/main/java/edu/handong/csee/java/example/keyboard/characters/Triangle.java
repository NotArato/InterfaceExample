package edu.handong.csee.java.example.keyboard.characters;

public class Triangle extends ShapeBasics implements TriangleInterface {

	private int base;
	
	public Triangle() {
		super();
		base = 0;
	}
	
	public Triangle(int theOffset, int theBase) {
		super(theOffset);
		base = theBase;
	}

	@Override
	public void set(int newBase) {
		base = newBase;
	}
	
	// method to draw the triangle at the current offset
	 public void drawHere()
	 {
		 drawTop();
	     drawBase();
	 }
	 
	 // method to draw the base of the triangle
	 private void drawBase()
	 {
	     skipSpaces(getOffset());
	     for (int count = 0; count < base; count++)
	          System.out.print('*');
	     System.out.println();
	 }
	 
	 // method to draw the top of the triangle
	 private void drawTop() {
		 int startOfLine = getOffset() + base / 2;
		 skipSpaces(startOfLine);
		 System.out.println('*');
		 
		 int lineCount = base / 2 - 1;
		 int insideWidth = 1;
		 
		 for(int count = 0; count < lineCount; count++) {
			 startOfLine--;
			 skipSpaces(startOfLine);
			 System.out.print('*');
			 skipSpaces(insideWidth);
			 System.out.println('*');
			 
			 insideWidth = insideWidth + 2;
		 }
	 }

	private static void skipSpaces(int number) {
		for(int count = 0; count < number; count++) {
			System.out.print(' ');
		}
	}

	 
}
