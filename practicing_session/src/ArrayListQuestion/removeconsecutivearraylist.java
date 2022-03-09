package ArrayListQuestion;
import java.util.ArrayList;
public class removeconsecutivearraylist {
    public static ArrayList<Integer> RemoveConsecutiveArraylist(int arr[]){
	ArrayList<Integer> result =new ArrayList<>();//object of array we was called upside;
	result.add(arr[0]); //we set elment set at index 0;
	for(int i = 1; i < arr.length;i++) {
	    if(arr[i]!=arr[i-1]) {
		result.add(arr[i]);
	    }
	}
	return result;
	}
    public static void main(String[] args) {
	int arr[] = {20,20,20,89,89,90,23,27};
	ArrayList<Integer>result = RemoveConsecutiveArraylist(arr);
	for(int i = 0;i<result.size();i++) {
	    System.out.println(result.get(i));
	}
	
	
    }

}
