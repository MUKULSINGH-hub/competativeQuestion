package linkedList;

public class Solution {
	public static int linkedList1(Node<Integer> head) {
		
		int count =0;
		Node<Integer>temp= head;
		while(temp!= null) {
			count++;
			temp= temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		Node<Integer>head = Solution();
		linkedList1(head);
		
		
	}

}
