//U10416043   廖崑智

//Class
public class Node {

	public Object element;
	public Node left;
	public Node right;

	//No arg onstructor
	public Node () { 
	}

	//Constructor
	public Node (Object theElement) {
		this(theElement, null, null);
	}

	public Node (Object theElement, Node leftMove, Node rightMove) {
		element = theElement;
		this.left = leftMove;
		this.right = rightMove;
	}
}
