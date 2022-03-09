package ZgreekForGreekQuestions;

public class PushZeroTwoEnd {
	public static void  pushZero(int[]arr){
		int nonZero = 0;
		for ( int i = 0; i < arr.length; i ++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonZero];		
				arr[nonZero] = temp;
				nonZero++;
			}
		}
	}

	public static void main(String[] args) {
		int [ ] input = {4,5,0,7,0,0,2,1};
		pushZero(input);
		for( int i = 0 ;i <input.length; i ++) {
		System.out.println(input[i]);
		}

	}

}
