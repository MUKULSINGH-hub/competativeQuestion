package ArrayListQuestion;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<>(2);
	arr.add(20);
	arr.add(50);
	arr.add(45);
	arr.add(39);
	arr.add(1,70); //the 70 is inserted into index 1.and the other will  shift;
	System.out.println(arr.size());//for knowing the size of array;
	System.out.println(arr.get(1));//for konwing which element is prsent in following index;
	//this for loop work in arr values;
	for(int i : arr) { 
	    System.out.println(i);
	}
	for(int i =0;i<arr.size();i++) {
	    System.out.println(arr.get(i));
	}
	

    }

}
