package linkedList;

public class solution1 {
	public static void printNode(LinkedListNode<Integer> head ,int i) {
		int position= 0;
		LinkedListNode<Integer>temp = head;
		while(temp!=null && position<i) {
			temp=temp.next;
			position++;
		}
		if(temp!=null) {
			System.out.println(temp.data);
		}
	}

	public static void main(String[] args) {
		

	}

}
