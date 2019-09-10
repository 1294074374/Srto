package sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] nums = { 4, 1, 9, 8, 3, 7, 2, 6, 5 };
		nums = bubblesort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static int[] bubblesort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		return nums;
	}
}
