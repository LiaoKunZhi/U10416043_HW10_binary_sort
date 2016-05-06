//U10416041   廖崑智

//Class
public class BS {

	public Node root;

	//Constructor
	public BS (Object o) {
		root = new Node(o);
	}
	
	//Insert the numbers to the node
	public Node Insert (Node node, int o) {

		if (node == null) {
			return node = new Node(o);
		}

		if (o < (Integer) node.element) {
			node.left = Insert(node.left, o);
		}
		else {
			node.right = Insert(node.right, o);
		}
		return node;
	}
}
