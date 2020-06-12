package java_test.exe;

public class BinnerSearchTree {
	Node root = null;
	
	public void insertBST(int i) { 
		root = this.inserNode(root, i);
	}
	
	public Node inserNode(Node n, int data) {
		Node p = n;
		Node node = new Node(data);
		if (p == null) {
			return node;
		} else if (p.getData() > data) {
			p.left = this.inserNode(p.left, data);
		} else if (p.getData() < data) {
			p.right = this.inserNode(p.right, data);
		}
		return p;
 	}
	
	public void printBST () {
		this.printNode(root);
	}
	
	public void printNode (Node n) {
		if (n != null) {
			this.printNode(n.left);
			System.out.print(n.getData());
			this.printNode(n.right);
		}
	}
	
	public Node searchBST (int s) {
		Node p = root;
		while(p != null) {
			if (p.getData() > s) {
				p = p.left;
			} else if (p.getData() < s) {
				p = p.right;
			} else {
				// 볹인이면 멈춘다.
				return p;
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		BinnerSearchTree bst = new BinnerSearchTree();
		bst.insertBST(3);
		bst.insertBST(1);
		bst.insertBST(9);
		bst.insertBST(4);
		bst.insertBST(2);
		bst.insertBST(7);
		bst.insertBST(6);
		
		bst.printBST();
		System.out.println();
		System.out.println(bst.searchBST(3).getData());
	}
}
