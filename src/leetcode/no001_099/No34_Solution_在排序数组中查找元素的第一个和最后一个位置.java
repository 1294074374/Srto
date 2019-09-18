package leetcode.no001_099;

public class No34_Solution_在排序数组中查找元素的第一个和最后一个位置 {
	int[] res = new int[2];

	public int[] searchRange(int[] nums, int target) {
		if (nums.length == 0) {
			res[0] = -1;
			res[1] = -1;
			return res;
		}
		res[0] = leftToRight(nums,target);
		if(res[0] == -1) {
			res[1] = -1;
		}else {
			res[1] = rightToLeft(nums,target);
		}
		
		return res;
	}
	private int leftToRight(int[] nums , int target) {
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	private int rightToLeft(int[] nums , int target) {
		for(int i = nums.length-1;i>-1;i--) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public int[] searchRangeBinarySearch(int[] nums, int target) {
		if (nums.length == 0) {
			res[0] = -1;
			res[1] = -1;
			return res;
		}
		int hight = nums.length - 1;
		int low = 0;
		binarySearch(nums, target, low, hight);
		
		return res;
	}
	private void binarySearch(int[] nums, int target, int low, int hight) {
		int mid = (low + hight) / 2;
		if (nums[mid] == target) {
			if (mid - 1 >= 0 && nums[mid - 1] == target) {
				res[0] = mid - 1;
				res[1] = mid;
			}
			if (mid + 1 <= nums.length - 1 && nums[mid + 1] == target) {
				res[0] = mid;
				res[1] = mid + 1;
			}
			return;
		}
		if (nums[mid] != target && low == hight) {
			res[0] = -1;
			res[1] = -1;
			return;
		}
		if (nums[mid] > target) {
			binarySearch(nums, target, low, mid);
		}
		if (nums[mid] < target) {
			binarySearch(nums, target, mid + 1, hight);
		}
	}

	
	public static void main(String[] args) {
		int[] nums = { 2,2 };
		int target = 2;
		No34_Solution_在排序数组中查找元素的第一个和最后一个位置 n = new No34_Solution_在排序数组中查找元素的第一个和最后一个位置();
		int[] res = n.searchRange(nums, target);
		System.out.println(res[0] + " " + res[1]);
	}
}
