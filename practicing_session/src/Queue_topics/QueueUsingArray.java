package Queue_topics;


public class QueueUsingArray {
    private int data[];//for storing data
    private int front;//index of element ata the front of the queue;
    private int rear;//index of the element at the rear  of the queue;
    private int size;//for how many elements are present in queue;
       
    public QueueUsingArray() {//constructor of the class
	data = new int[5];
	front = -1;/////////-1 ia a imagine index;
	rear = -1;
	}
    
     //the second constructor for knowing how many element queue can store; 

 public QueueUsingArray(int Capacity ) { //constructor
     data = new int[Capacity];
     front = -1;
     rear = -1;
     
 }
 //for konwing the size of queue;
 
 public int size() {
     
     return size;
 }
 //for knowing queue is empty or not$$$$$$$$$
 public boolean isEmpty() {
     return size == 0;
 }
 //this is the main function.this function take the elemts and put into the queue 
 public void enqueue(int elem)  {
     if(size==data.length) {
//	 throw new QueueFullException();
	 doubleCapacity();
     }
     if(size==0) {
	 front=0;
     }
     rear= (rear+1)%data.length;
     
     data[rear]= elem;
     size++;
//     rear++;
//     if(rear==data.length) {
//	 rear= 0;
//     }
     //this is the alternate way to written the upper case $$$$
     
     
 }
 private void doubleCapacity() {
    int temp[]= data;
    data = new int[2 *temp.length];
    int index = 0;
    for(int i = front; i < temp.length; i ++) {
	data[index++]= temp[i];
    }
    ///for put elements in a serial way
    for(int i =0; i<front-1;i++) {
	data[index++]=temp[i];
    }
    
    front=0;
    rear= temp.length-1;
    
}

public int front() throws QueueUsingException {
     if(size==0) {
	 throw new QueueUsingException();
     }
     return data[front];
     
 }
 public int dequeue() throws QueueUsingException {
     if(size==0) {
	 throw new QueueUsingException();
     }
     int temp = data[front];
//     front++;
//          if(front==data.length) {
//	 front = 0;
//     }
     //alternate way to  written the upper case;
     front = (front+1)%data.length;
     
     size--;
     if(size==0) {
	 front=-1;
	 rear= -1;
     }
     return temp;
 }
 
 
 
 
 
}