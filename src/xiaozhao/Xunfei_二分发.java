package xiaozhao;

public class Xunfei_���ַ� {
	public static void main(String[] args) {
		Xunfei_���ַ� x = new Xunfei_���ַ�();
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
