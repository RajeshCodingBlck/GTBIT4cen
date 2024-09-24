package LinkedList;

public class MyLinkedList {

	private Node head=null;
	
	
	public void InsertAtBegin(int val) {
		
		Node newNode= new Node(val);
		newNode.next=head;
		head=newNode;
	}
	
	public void display() {
		Node temp=head;
		while(temp !=null) {
			System.out.print(temp.data+ " -> ");
			temp=temp.next;
		}
		
	}
	public void InsertAtEnd(int val) {
		
		if(head==null) {
			InsertAtBegin(val);
			return;
		}
		Node temp=head;
		while(temp.next !=null) {
			temp=temp.next;
		}
		Node newNode= new Node(val);
		temp.next=newNode;
	}
}
