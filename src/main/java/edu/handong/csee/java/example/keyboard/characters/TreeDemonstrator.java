package edu.handong.csee.java.example.keyboard.characters;

public class TreeDemonstrator {

	// constants for tree dimensions and position
	public final int INDENT = 5;
	public static final int TREE_TOP_WIDTH = 21;// must be odd
	public static final int TREE_BOTTOM_WIDTH = 4;
	public static final int TREE_BOTTOM_HEIGHT = 4;

	// main method to run the tree demonstration
	public static void main(String[] args) {
		
		TreeDemonstrator demonstrator = new TreeDemonstrator();
		demonstrator.drawTree(TREE_TOP_WIDTH, TREE_BOTTOM_WIDTH,
				TREE_BOTTOM_HEIGHT);
	}

	// method to draw the tree using the specified dimensions
	public void drawTree(int topWidth, int bottomWidth, int bottomHeight)
	{
		System.out.println(" Save the Redwoods!");
		TriangleInterface treeTop = new Triangle(INDENT, topWidth);
		drawTop(treeTop);
		RectangleInterface treeTrunk = new Rectangle(INDENT +
				(topWidth / 2) - (bottomWidth / 2),
				bottomHeight, bottomWidth);
		drawTrunk(treeTrunk);
	}

	// helper method to draw the tree top
	private void drawTop(TriangleInterface treeTop) {
		treeTop.drawAt(1);
	}

	// helper method to draw the tree trunk
	private void drawTrunk(RectangleInterface treeTrunk) {
		treeTrunk.drawHere(); // or treeTrunk.drawAt(0); }

	}
}