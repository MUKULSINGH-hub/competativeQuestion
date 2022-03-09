package StackProblem;

public class StackUse {

	public static void main(String[] args) throws StackFullException, TopIndexException {
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		int arr[]= {5,78,89,45};
		for( int i = 0; i<arr.length;i++) {
		    stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
		    System.out.println(stack.pop());
		}
//		stack.size();
//		System.out.println(stack.size());
//		System.out.println(stack.top());
//		
//		System.out.println();
//		stack.top();
//		System.out.println(stack.top());
//		stack.pop();
//		stack.size();
//		stack.isEmpty();
//		System.out.println(stack.isEmpty());
//		

	}

}
