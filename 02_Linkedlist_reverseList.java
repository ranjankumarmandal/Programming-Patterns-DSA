import java.util.*;


class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    
    // =============
    public Node reverseNode(Node head) {
        Node curr = head, prev = null, next;
        
        while(curr != null) {
            next = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        
        return prev;
    } 
    
    public void printList(Node head) {
        while(head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }
    }
}

public class Main {
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		LinkedList ll = new LinkedList();
		
		System.out.print("Given linkedlist is: ");
		ll.printList(head);
		System.out.println();
		
		// reverse list 
		head = ll.reverseNode(head);
		
		System.out.print("Reversed List is: ");
		ll.printList(head);
		
	}
}
