package practicing_session;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Linkedlist {
	
	
//	public static Node<Integer> createLinkedList(){
//	    //comfusing things
//	    //Node n1 stores the refrences 
////	          and
//	    //new Node() stores the data;
//		Node<Integer> n1 =new Node<>(10);
//		Node<Integer> n2 = new Node<>(20);
//		Node<Integer> n3 = new Node<>(30);
//		Node<Integer> n4 = new Node<>(40);
//		//now  we are making connection of these
//		n1.next = n2; //n1.next stores the addresss of n2;
////		System.out.println(n1.data+""+""+""+n1.next);
//		n2.next=n3;								
////		System.out.println(n2.data+""+n2.next);
//		n3.next = n4;
////		System.out.println(n3.data+""+n3.next);
////		System.out.println(n4.data+""+n4.next);
//		return n1;
//		
//	}
	public static void print(Node<Integer> head) {  //print is a function node 
	    //and Node is  a integral data type 
	    //head is the head of node list
	    //head is the refrence it will hold the address .
	    
	    //if we print the value of first node head then we call head.data it give me =10
	    //if we print the data of next node we give head.next it give me the valueof next node;
		while(head!=null ) { //if head is null  no more value will print
			System.out.println(head.data);
			head= head.next; //head.next have the adddress of all node one by one .head.next = 10 the head = 10
			
		}
		System.out.println();
	}
//	public static void increment(Node<Integer> head) {
//	    Node<Integer>temp = head;
//	    while(temp!=null) {
//		temp.data++;
//		temp = temp.next;
//	
//	}
//	
////	    }
//	public static int length(Node<Integer> head) {
//	    int count= 0;
//	    Node<Integer> temp= head;
//	   while(temp!=null) {
//	       count++;
//	       temp= temp.next;
//	       
//	   }
//	    return count;
//	}
	
	public static Node<Integer> takeInput(){
	    Scanner sk = new Scanner(System.in);
		 int data = sk.nextInt();
	    
	   //it will take input frm the user;
	    //firstly i am taking head =null 
	    Node<Integer> head=null;
	    ///if the user will press -1 the code will stop;
	    while(data!=-1) {
		//in this current node have only address ///if the user give input corrrnent node is first input value
		Node<Integer>currentNode = new Node<Integer>(data); 
		if(head==null) {///if head is qual to Null head = current  Node now the current node have some value
		    head=currentNode;
		}else {
		    Node<Integer>tail=head;
		    while(tail.next!=null) {
			tail=tail.next;
		    }
		    tail.next=currentNode;
		}
		data=sk.nextInt();
		
	    }
	    return head;
	}
	public static Node<Integer> insert(Node<Integer> head,int element,int position) {
	    
	    Node<Integer> NodeToBeInserted= new Node<Integer>(element);
	    if(position== 0) {
		NodeToBeInserted.next = head;
//		head= NodeToBeInserted;
		return NodeToBeInserted;
		
	    }
	    else {
	    
	    int count=0;
	    Node<Integer> previous= head;
	    while(count< position-1 && previous!=null) {
		count++;
		previous= previous.next;
	    }
	    if(previous!=null) {
	     NodeToBeInserted.next= previous.next;//first we have store the i-1 node in new node .next
	  previous.next= NodeToBeInserted;
	   }
	    return head;
	    }
	   
	}
       public static void main(String[] args) {
		Node<Integer> head = takeInput();//createLinkedList();
//		increment(head);
		//we declaring head as well as main
		//because in main haed is point only first number as a head;
		 head=insert(head, 59, 0);
		print(head);
//		System.out.println(length(head));
		
//		  Node<Integer> n1 = new Node<>(10);
//		  System.out.println(n1.data);
//		  System.out.println(n1.next);

	}

	}
