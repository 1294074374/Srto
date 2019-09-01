package xiaozhao;

import java.util.Scanner;

public class Tencent_»¨½³Ð¡Q {
	static int sum = 0;
	static int k = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		k = sc.nextInt();

		int[][] model = new int[t][2];

		for (int i = 0; i < t; i++) {
			model[i][0] = sc.nextInt();
			model[i][1] = sc.nextInt();
		}
		for (int i = 0; i < t; i++) {
			StringBuffer str =new StringBuffer();
			for(int j = 0;j<model[i][0];j++) {
				str.append("r");
			}
			for(int j = 0;j<model[i][1];j++) {
				str.append("w");
			}
			Perm(str.toString().toCharArray(), k,str.toString().toCharArray().length);
		}
		sc.close();
	}

	private static void Perm(char[] nums, int o, int len) {
		if (o == len) {
			
			for(int i=0;i<nums.length;i++) {
				
			}
		} else {
			for (int j = o; j < len; j++) {
				char temp = nums[j];
				nums[j] = nums[o];
				nums[o] = temp;

				Perm(nums, o + 1, len);

				temp = nums[j];
				nums[j] = nums[o];
				nums[o] = temp;
			}
		}

	}
}
