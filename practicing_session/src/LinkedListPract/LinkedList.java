package LinkedListPract;
import java.util.Scanner;
public class LinkedList {
	public static  void print( Node<Integer> head) {
		  while ( head!=null) {
			  System.out.println(head.data);
			  head = head.next;
		  }
	}
	public static Node<Integer> insertNode( Node<Integer> head , int element, int position){
		
	}
	
	public static Node<Integer> takeUserData(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head= null;
		while(data!= -1) {
		Node<Integer>currentNode = new Node<Integer>(data);
		//now the condition
		if(head==null) {
			//make this node as a current node;
			head=currentNode;
		}else {
			Node<Integer>tail= head;
			while(tail.next!=null) {
				tail= tail.next;
			}
			tail.next= currentNode;
			}
		data=sc.nextInt();
		}
		return head;
		}
	public static void main(String[] args) {
		Node<Integer>head = takeUserData();
		print(head);
		
		
	}

}
