package ZgreekForGreekQuestions;

public class ceillling {
	public static int getceil(int[]arr , int x) {
		int start = 0;
		int end = arr.length-1;
		int ceil =-1; // take a variable of ceil name and assign the value -1;
		while ( start<= end) {
			int mid= (start + end)/2;
			if(arr[mid]== x) {
				return arr[mid];
				
			}
			else if (x < arr[mid ]) {
				ceil = arr[mid];
				end  = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		return ceil;
	}
	public static int getfloor( int[]arr, int x) {
		int start = 0;
		int end = arr.length-1;
		int floor =-1;
		while ( start<= end) {
		 int mid = (start + end)/2;
			if(arr[mid]== x) {
				return arr[mid];
				
			}
			else if (x < arr[mid ]) {
			
				end  = mid -1;
			}
			else {
				floor= arr[mid];
				start = mid + 1;
			}
		}
		return floor;
		
	}

	public static void main(String[] args) {
		int[]arr = {2,5,8,12,45,67,123};
		for(int i = 0; i < arr.length;i++) {
			System.out.println("Number"+i+"is"+getceil(arr,i)+",floor is"+getfloor(arr,i));
		}
		
}
	}
