package practicing_session;

public class Node<T> { //in Nodes we have two things 1) integral Data 2) address of next Node;

	T data;//integral data;
	Node<T> next; //this stores the address of next Node;
	Node(T data){  //or it is a construct of a Node class;
		this.data =data;     
		this.next =null;
	}
	

} 