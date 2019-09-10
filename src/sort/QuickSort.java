package sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] nums = { 4, 1, 9, 8, 3, 7, 2, 6, 5 };
		nums = quicksort(nums, 0, nums.length - 1);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static int[] quicksort(int[] nums, int start, int end) {
		int pivot = nums[start];
		int i = start;
		int j = end;
		while (i < j) {
			while (i < j && nums[i] < pivot)
				i++;
			while (i < j && nums[j] > pivot)
				j--;
			if (nums[i] == nums[j] && i < j) {
				i++;
			} else {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		if (i - 1 > start)
			nums = quicksort(nums, start, i - 1);
		if (j + 1 < end)
			nums = quicksort(nums, j + 1, end);
		return nums;
	}
}
