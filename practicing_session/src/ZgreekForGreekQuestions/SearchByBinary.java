package ZgreekForGreekQuestions;

public class SearchByBinary {
	public static int searchElement(int[] input, int nums) {
		int start = 0;
		int end = input.length - 1;

		while (start <= end) {
			int Mid = (start + end) / 2;
			if (nums == input[Mid]) {
				return Mid;
			} else if (nums > input[Mid]) {
				start = Mid + 1;
			} else {
				end = Mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 4, 5, 7, 8, 9, 2 };
		int ans = searchElement(input, 6);
		if (ans == -1) {
			System.out.println("Elemnts is not present");
		} else {
			System.out.println("Element is present " + ans);
		}

	}

}
