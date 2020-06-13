package java_test.exe;

public class TestNode {
	private int data;
	TestNode left;
	TestNode right;
	
	public TestNode (int d) {
		left = null;
		right = null;
		data = d;
	}
	
	public int getData () {
		return data;
	}
}
