package java_test.algorithm;

public class TreeNode {
    char data;
    String nodeName;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(){
        this.left = null;
        this.right = null;
    }
    
    public TreeNode(char data){
        this.data = data;
        this.left = null;
        this.right = null;
        setNodeName(data);
    }
    
    public Object getData(){
        return data;
    }
    
    public void setNodeName (char data) {
    	this.nodeName = data + " Node";
    }
    
    public String getNodeName () {
    	return this.nodeName;
    }
}