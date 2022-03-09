package StackProblem;

public class InsertionSort {
	public static void insertionsort(int arr[]) {
		for(int i = 0; i <arr.length;i++) {
			int j = i -1;
			int temp = arr[i];
			while( j >=0 && arr[j] > temp) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= temp;
			
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,7,8,3,9,3,5 };
		insertionsort(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
