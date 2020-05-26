package java_test.algorithm.testBinarySearch;

public class TestNode {
	private char data;
	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public TestNode getLeft() {
		return left;
	}

	public void setLeft(TestNode left) {
		this.left = left;
	}

	public TestNode getRight() {
		return right;
	}

	public void setRight(TestNode right) {
		this.right = right;
	}

	private TestNode left;
	private TestNode right;
	
	public TestNode () {
		this.left = null;
		this.right = null;
	}
	
	public TestNode (char data) {
		this.left = null;
		this.right = null;
		this.data = data;
	}
}
