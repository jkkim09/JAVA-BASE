package java_test.exe;

public class Node {
	Node left;
	Node right;
	private int data;
	
	public Node(int d) {
		this.left = null;
		this.right = null;
		this.data = d;
	}
	
	public int getData() {
		return this.data;
	}
}
