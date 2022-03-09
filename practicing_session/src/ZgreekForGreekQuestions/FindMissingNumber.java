package ZgreekForGreekQuestions;

public class FindMissingNumber {
	public static int missingnumber(int[] input) {
		int n = input.length;
		System.out.println(n);
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++) {
			//one by one we are subtarcting element 
			sum = sum - input[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 4, 7, 8, 5, 6 };
//		int nums = missingnumber(input);
		System.out.println(missingnumber(input));

	}

}
