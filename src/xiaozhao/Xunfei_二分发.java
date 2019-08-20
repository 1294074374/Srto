package xiaozhao;

public class Xunfei_二分发 {
	public static void main(String[] args) {
		Xunfei_二分发 x = new Xunfei_二分发();
		int[] array = { 11, 13, 15, 17, 19, 21 };
		System.out.println(x.binarysearch(array,0,array.length-1,15));
	}

	public int binarysearch(int array[], int low, int hight, int target) {
		if (low > hight) {
			return -1;
		}
		int mid = low + (hight - low) / 2;
		if (array[mid] > target) {
			return binarysearch(array, low, mid - 1, target);
		}
		if (array[mid] < target) {
			return binarysearch(array, mid + 1, hight, target);
		}

		return mid+1;
	}
}
