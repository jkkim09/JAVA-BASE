package java_test.exe;

public class TestSelectionSort {
	TestNode root = null;
	
	public void insertBST(int d) {
		root = insertNode(root, d);
	}
	
	public TestNode insertNode(TestNode n, int d) {
		TestNode p = n;
		TestNode node = new TestNode(d);
		if (p == null) {
			return node;
		} else if (p.getData() > d) {
			p.left = insertNode(p.left, d);
		} else if (p.getData() < d) {
			p.right = insertNode(p.right, d);
		}
		return p;
	}
	
	public void printBST() {
		printNode(root);
	}
	
	public void printNode(TestNode n) {
		if (n != null) {
			printNode(n.left);
			System.out.print(n.getData());
			printNode(n.right);
		}
	}
	
	
	public static void main(String[] args) {
		TestSelectionSort t = new TestSelectionSort();
		t.insertBST(3);
		t.insertBST(1);
		t.insertBST(4);
		t.insertBST(6);
		t.insertBST(2);
		t.printBST();
	}

}
