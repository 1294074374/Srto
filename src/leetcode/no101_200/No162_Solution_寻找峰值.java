package leetcode.no101_200;

public class No162_Solution_—∞’“∑Â÷µ {
	public int findPeakElement(int[] nums) {
		if(nums.length == 1) {
			return 0;
		}
		int[] nums2 = new int[nums.length + 2];
		nums2[0] = Integer.MIN_VALUE;
		nums2[nums2.length - 1] = Integer.MIN_VALUE;
		for (int i = 1; i < nums2.length-1; i++) {
			nums2[i] = nums[i - 1];
		}
		for (int i = 1; i < nums2.length - 1; i++) {
			if (nums2[i] > nums2[i - 1] && nums2[i] > nums2[i + 1]) {
				return i-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {  1 };
		No162_Solution_—∞’“∑Â÷µ n = new No162_Solution_—∞’“∑Â÷µ();
		System.out.println(n.findPeakElement(nums));
	}
}
