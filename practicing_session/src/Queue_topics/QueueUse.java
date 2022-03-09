package Queue_topics;

public class QueueUse {

    public static void main(String[] args) {
	QueueUsingArray queue = new QueueUsingArray();
	int arr[] ={34,56,67,89};
	for(int elem : arr ) {
	    try {
		queue.enqueue(elem);
	    }
	    catch(QueueFullException e){
		
	    }
		
	}
	
	while(!queue.isEmpty()) {
	    try {
		System.out.println(queue.dequeue());
	    }
	    catch(QueueUsingException e) {
		
	    }
	}
	
	

    }


}
