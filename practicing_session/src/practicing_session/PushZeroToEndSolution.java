package practicing_session;

public class PushZeroToEndSolution {
	public static void PushZero( int [] input) {
		int nonZero = 0;
		for( int i = 0; i < input.length; i++) {
			if( input[i]!= 0) {
				int temp = input[i];
				input[i]= input[nonZero];
				input[nonZero]= temp;
				nonZero++;
			}
		}
	}

	public static void main(String[] args) {
		int []arr = {2,0,4,6,0,0,0,4,5,0};
		PushZero(arr);
		for( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		 

	}

}
