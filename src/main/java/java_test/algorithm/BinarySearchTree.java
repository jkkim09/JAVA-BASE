package java_test.algorithm;

public class BinarySearchTree {
	int count = 0;
    private TreeNode root = null;
    
    public TreeNode getRootNode () {
    	return root;
    }
    
    public TreeNode insertKey(TreeNode root, char x) {
        TreeNode p = root;
        TreeNode newNode = new TreeNode(x);
        
        if(p==null){
        	System.out.println("test == : " + x);
            return newNode;
        }else if(p.data>newNode.data){
        	System.out.println("test << : " + p.getNodeName() + " : " + x);
            p.left = insertKey(p.left, x);
            return p;
        }else if(p.data<newNode.data){
        	System.out.println("test >> : " + p.getNodeName() + " : " + x);
            p.right = insertKey(p.right, x);
            return p;
        }else{ 
        	System.out.println("test3 : " + p.getNodeName() + " : " + x);
            return p;
        }
    }
    
    public void insertBST(char x){
        root = insertKey(root, x);
    }
    
    public TreeNode searchBST(char x){
        TreeNode p = root;
        while(p!=null){
            if(x<p.data) {
            	p = p.left;
            } else if(x>p.data) {
            	p = p.right;
            } else {
            	return p;
            }
        }
        return p;
    }
    
    public void inorder(TreeNode root){
    	count++;
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    public void printBST(){
        inorder(root);
        System.out.println();
    }
    
    public static void main(String[] args) {
    	System.out.println("--------처리 동직----------");
    	BinarySearchTree bst = new BinarySearchTree();
    	bst.insertBST('A');
        bst.insertBST('D');
	    bst.insertBST('B');
	    bst.insertBST('C');
	    bst.insertBST('F');
        
	    System.out.println("-------------------------");
        bst.printBST();
        System.out.println("--------Root Node--------");
        System.out.println(bst.getRootNode().getNodeName());
        System.out.println("-----------검색-----------");	
        TreeNode p1 = bst.searchBST('F');
        if(p1!=null){
            System.out.println(p1.getNodeName() + " : " + p1.data + " 탐색 성공");
        }else{
            System.out.println("탐색 실패");
        }

    }
}