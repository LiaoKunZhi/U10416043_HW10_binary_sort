//U10416043   廖崑智

//Class
public class TestBS {

	//Main method
	public static void main (String args[]) {

		  int[] n = { 17, 2, 9, 3, 13, 0, 4, 30, 7, 31, 20, 1};

		  BS bs = new BS(new Integer(n[0]));

		  for (int t = 1; t < n.length; t++) {
			bs.Insert(bs.root, new Integer(n[t]));
		  }

		  bs.inOrder(bs.root);
	}
}
