package StackProblem;



public class StackUsingArray {
	private int data[];
	private int topIndex;//it is the index of the top most element;
	//this function is a constructor;
	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;
		}
	public StackUsingArray(int size) {
		data = new int[size];
		topIndex = -1;
		}
	// this function for checking stack is empty or not;
     public boolean isEmpty() {
    	 if(topIndex == -1) {
    		 return true;
    	 }else {
    		 return false;
    	 }
		
	}
     //for finding size;
    public int size() {
    	return topIndex + 1;//  
    	}
	
//	public void push(int element) throws StackFullException {
//		//this condition forr this if stack is full
//		if(topIndex == data.length-1) {
//			//we throw an exception here;
//			StackFullException e = new StackFullException();
//			throw e;
//			}
    
    
    public void push(int element)  {
	//this condition forr this if stack is full
	if(topIndex == data.length-1) {
	    
	    doubleCapacity();
		
		}
	
	data[++topIndex]= element;	
	}
    
    private void doubleCapacity() {
	System.out.println(" using double capacity");
	int temp[] = data;
	data =new int[2* temp.length];
	for(int i=1; i<temp.length;i++) {
	    data[i]=temp[i];
	}
    }
	public int top() throws TopIndexException {
	    if(topIndex== -1) {
		///throw a exception
		TopIndexException eT = new TopIndexException();
		throw eT;
	    }
	    return data[topIndex];
		
	}
	public int pop() throws TopIndexException {
	    if(topIndex== -1) {
		///throw a exception
		TopIndexException eT = new TopIndexException();
		throw eT;
	    }
	    int temp = data[topIndex];
	    topIndex--;
	    return temp;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
