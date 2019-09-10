package sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] nums = { 4, 1, 9, 8, 3, 7, 2, 6, 5 };
		nums = insertionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static int[] insertionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return arr;
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					//
				} else {
					// 接下来是无用功
					break;
				}
			}
		}
		return arr;
	}
}
