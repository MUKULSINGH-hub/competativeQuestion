package ZgreekForGreekQuestions;
import java.util.*;
import java.lang.*;

public class SumClosestToZero {
	public static void sumclosestozero(int[] arr, int arr_size) {
		if (arr_size < 2) {
			System.out.println("sorry , two numbers are not allowed here");
			return;
		}
		//first we intalize our value for simplicity
		int firstElement = 0; //let//
		int secondElement = 1;//let//
		int lowestSum = arr[0] + arr[1];//let//
		for (int i = 0; i < arr_size - 1; i++) {
			for (int j = i + 1; j < arr_size; j++) {
				int sum = arr[i] + arr[j];
				if (Math.abs(lowestSum) > Math.abs(sum)) {
					lowestSum = sum;
					firstElement = i;
					secondElement = j;
System.out.println("jxjldk");
				}

			}
		}
		System.out.println("the two element whose sum is closest to zero in given array are ==   "+arr[firstElement] +" and "+ arr[secondElement]);
	}

	public static void main(String[] args) {
		int[] arr = { 2,1, 4, 5, 6, 7,-1, 8, 9 };

		sumclosestozero(arr, 7);

	}

}
