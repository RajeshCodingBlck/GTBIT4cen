package LinkedList;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      int size= (int)1e10; // 10^10
//      int [] arr= new int[size];
		
		Node n1= new Node(12);
		Node n2= new Node(13);
		Node n3= new Node(13);
		n1.next=n2;
		n2.next=n3;
		
		Node head=n1; // Assign Another Name to any Node..
		
		Node temp=n2;
		
		// temp=n3;
		temp= n2.next; // Shifting 
		System.out.println("N1 -> "+n1);
		System.out.println("N2 -> "+n2);
		System.out.println("N3 -> "+ n3);
		System.out.println(n1.next);
		System.out.println(n2.next);
      
	}

}
