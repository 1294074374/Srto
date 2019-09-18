package xiaozhao.kuaishou;

import java.util.Scanner;

public class Main_合并数组 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		String[] str1 = s1.split(",");
		String[] str2 = s2.split(",");
		int len1 = str1.length;
		int len2 = str2.length;
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		for (int i = 0; i < len1; i++) {
			arr1[i] = Integer.parseInt(str1[i]);
		}
		for (int i = 0; i < len2; i++) {
			arr2[i] = Integer.parseInt(str2[i]);
		}
		int[] ans = new int[len1 + len2];
		int i = 0;
		int j = 0;
		for (int k = 0; k < ans.length; k++) {
			if (i < arr1.length && j < arr2.length && arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				continue;
			} else if (j < arr2.length && i < arr1.length && arr1[i] >= arr2[j]) {
				ans[k] = arr2[j];
				j++;
				continue;
			} else if (i == arr1.length && j < arr2.length) {
				ans[k] = arr2[j];
				j++;
				continue;
			} else if (j == arr2.length && i < arr1.length) {
				ans[k] = arr1[i];
				i++;
				continue;
			}
		}
		String res = "";
		for (int k = 0; k < ans.length; k++) {
			if (k != ans.length - 1) {
				res = res + ans[k] + ",";
			}if (k == ans.length - 1) {
				res = res + ans[k];
			}
		}
		System.out.println(res);
		in.close();
	}
}
