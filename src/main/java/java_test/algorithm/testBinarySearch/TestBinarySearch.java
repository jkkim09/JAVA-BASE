package java_test.algorithm.testBinarySearch;

public class TestBinarySearch {
	public TestNode base = null;
	
	public TestNode nodeAdd (TestNode node, char data) {
		TestNode currentNode = node;
		
		if (currentNode == null) {
			return new TestNode(data);
		} else if (currentNode.getData() > data) {
			currentNode.setLeft(nodeAdd(currentNode.getLeft(), data));
		} else if(currentNode.getData() < data){
			currentNode.setRight(nodeAdd(currentNode.getRight(), data));
        }
		return currentNode;
	}
	
	public void add (char data) {
		base = nodeAdd(base, data);
	}
	
	
	public void testGet () {
		System.out.println(base.getLeft().getData());
	}
	
	public static void main(String[] args) {
		TestBinarySearch tbs = new TestBinarySearch();
		tbs.add('A');
		tbs.add('B');
		tbs.testGet();
	}
}
