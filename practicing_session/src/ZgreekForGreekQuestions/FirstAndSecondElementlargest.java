package ZgreekForGreekQuestions;

public class FirstAndSecondElementlargest {
	public static void findlargestElement(int[]arr) {
		int first,second,arr_size = arr.length;
		if(arr_size < 2) {
			System.out.println("Invalid input");
		}
		first = second = Integer.MAX_VALUE;  /// Define the value of first and value in maximiym value
		for(int i = 0;i<arr_size;i++) {
			if ( arr[i] < first) {
				second = first; //here first  is became a second and the first is became a current element; 
				first = arr[i];
			}
			else if(arr[i]< second && arr[i]!= first ) {
				second = arr[i];
			}
		}
		if (second == Integer.MAX_VALUE) {
			System.out.println(" there is no second smallest number");
			
		}else {
			System.out.println("The first smallest element is"+ first+ "and the second smallest element is "+second);
		}
		
		
	}

	public static void main(String[] args) {
		int[]arr = {2,5,7,1,3,5,9};
		 findlargestElement(arr);
	

	}

}
