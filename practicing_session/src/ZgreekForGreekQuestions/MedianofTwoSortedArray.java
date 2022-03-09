package ZgreekForGreekQuestions;

public class MedianofTwoSortedArray {
	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		int N1 = arr1.length;
		int N2 = arr2.length;
		int[] arr3 = new int[N1 + N2];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < N1 && j < N2) {
			if (arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;

			} else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < N1) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while (j < N2) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		return arr3;
	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static double findMedian(int[] arr) {
		int n = arr.length;
		double median;
		if (n % 2 == 0) {
			median = arr[n / 2 - 1];

		} else {
			median = (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
		}
		return median;

	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 9 };
		int arr2[] = { 2, 4, 6, 8, 10 };
		int mergearray[] = mergeTwoArray(arr1, arr2);
		print(mergearray);
		System.out.print("Now your median of two sorted array  is = ");
		System.out.println(findMedian(mergearray));

	}

}
