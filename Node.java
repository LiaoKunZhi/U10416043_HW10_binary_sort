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
}
