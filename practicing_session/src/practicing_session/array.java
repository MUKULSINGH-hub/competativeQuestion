package practicing_session;
import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(1,60);//this is the adding one more number number index number 1 20 to 60
    for( int i=0; i<arr.size();i++)
    {
    	System.out.println(arr.get(i));
    }
	//	arr.remove(1);
//	arr.remove(1);
	arr.set(3,90);//it set the vaklue in the index 3 90 in thr place of 40
//	System.out.println(arr.size());
//	System.out.println(arr.get(3));
//	enhanced for loop
	for(int i:arr) {
		System.out.println(i);
	}

	}

}
