package LinkedListconcept1;
import java.util.Scanner;

public class LinkedListConcept1 {
	//this function for print value of head
	public static void print1(Node_1<Integer> head) {
		while(head!=null) {
			System.out.println(head.data1);
			head=head.next;	
		}
	}
	public static Node_1<Integer> takeUserData1(){
	Scanner sc = new Scanner(System.in);
	int data = sc.nextInt();
	Node_1<Integer> head= null;
	while(data!= -1) {
	Node_1<Integer>currentNode_1 = new Node_1<Integer>(data);
	//now the condition
	if(head==null) {
		//make this node as a current node;
		head=currentNode_1;
	}else {
		Node_1<Integer>tail= head;
		while(tail.next!=null) {
			tail= tail.next;
		}
		tail.next= currentNode_1;
		}
	data=sc.nextInt();
	}
	return head;
	}
	public static Node_1<Integer>insertNode_1( Node_1<Integer>head , int element1,int position1 ){
		Node_1<Integer>newInsertingNode_1  = new Node_1<Integer>(element1);
		if(position1  == 0) {
			newInsertingNode_1.next= head;
//			head= newInsertingNode_1;
			return newInsertingNode_1;
		}
		else {
			int count=0;
			Node_1<Integer>previous1 = head;
			while(count<position1-1 && previous1!=null) {
				count++;
				previous1=previous1.next;
				
			}
			if(previous1!=null) {
			newInsertingNode_1.next=previous1.next;
			previous1.next=newInsertingNode_1;
			}
			
		}
		
		return head;
		}
	public static void main(String[] args) {
		Node_1<Integer> head = takeUserData1();
		head=insertNode_1(head,57 , 4);
		print1(head);
//		System.out.println(head);
		

	}

}
