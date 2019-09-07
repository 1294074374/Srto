package xiaozhao.netease;

import java.util.Scanner;

public class Main_¿§·È {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int K = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[31];
			for (int j = 0; j < M; j++) {
				int temp = sc.nextInt();
				arr[temp] = 1;
			}
			System.out.println(findCoffer(K, M, arr));
		}
		sc.close();
	}

	/**
	 * 
	 * @param k   ¼ä¸ôºÈ¿§·ÈÊý
	 * @param m   ±ØÐëºÈ¿§·ÈÊý
	 * @param arr ±ØÐëºÈ¿§·ÈµÄÌìÊý
	 * @return
	 */
	private static int findCoffer(int k, int m, int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 1)
				continue;
			else {
				if (check(i, k, arr)) {
					arr[i] = 1;
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
				cnt++;
		}
		return cnt;
	}

	private static boolean check(int i, int k, int[] arr) {
		int x = i;
		while (x > 0 && x >= i - k) {
			if (arr[x] == 1)
				return false;
			x--;
		}
		int y = i;
		while (y < arr.length && y <= i + k) {
			if(arr[y] == 1)
				return false;
			y++;
		}
		return true;
	}
}
