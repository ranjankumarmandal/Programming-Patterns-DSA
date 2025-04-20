import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    
    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class BST {
    
    public Node constructBST(int[] arr, int left, int right) {
        if(left > right) return null;
        
        int mid = (left + right) / 2;
        
        int data = arr[mid];
        Node lc = constructBST(arr, left, mid - 1);
        Node rc = constructBST(arr, mid + 1, right);
        
        Node root = new Node(data, lc, rc);
        
        return root;
    }
    
    public void printBST(Node node) {
        if(node == null) return;
        
        System.out.println(node.data);
        printBST(node.left);
        printBST(node.right);
    }
}

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 6, 7, 8, 9, 10};
		
		BST bst = new BST();
		Node root = bst.constructBST(arr, 0, arr.length - 1);
		bst.printBST(root);
	}
}
