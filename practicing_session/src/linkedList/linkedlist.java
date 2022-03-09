package linkedList;

public class linkedlist {
	// this function for create a limked list 
  public static Node<Integer> createLinkedList(){
	  Node<Integer>n1 = new Node<>(10);
	  Node<Integer>n2=new Node<>(20);
	  Node<Integer>n3=new Node<>(30);
	  Node<Integer>n4= new Node<>(50);
	  n1.next= n2;
	  n2.next=n3;
	  n3.next=n4;
	  return  n1;
	  }
  //this functiom for printing the array
  public static void print(Node<Integer> head) {
//	  System.out.println(head);
	  Node<Integer> temp = head;  
	  while(temp!=null) {
		  System.out.println(temp.data);
		  temp= temp.next;  
	  }
	  System.out.println();
  }	
  public static void increment(Node<Integer> head) {
	  while(head!=null) { 
	  head.data++;
	  }
  }
	
	public static void main(String[] args) {
	Node<Integer>head = createLinkedList();
	print(head);
	increment(head);
//	print(head);
	

	}

}
