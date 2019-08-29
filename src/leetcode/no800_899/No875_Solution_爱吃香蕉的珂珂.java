package leetcode.no800_899;

public class No875_Solution_°®³ÔÏã½¶µÄçæçæ {
	public int minEatingSpeed(int[] piles, int H) {
		int low = 1;
		int height = 1000000000;
		while (low < height) {
			int min = (low + height) / 2;
			if (possible(piles, H, min)) {
				height = min;
			} else {
				low = min + 1;
			}
		}
		return low;
	}

	private boolean possible(int[] piles, int h, int min) {
		int time = 0;
		for (int p : piles) {
			time = time + p / min;
			// Õâ¸öÐ¡Ê±ÄÚÓÐÊ£Óà
			if (p % min != 0) {
				time++;
			}
		}
		return time <= h;
	}

	public static void main(String[] args) {
		No875_Solution_°®³ÔÏã½¶µÄçæçæ n = new No875_Solution_°®³ÔÏã½¶µÄçæçæ();
		int[] piles = { 3, 6, 7, 11 };
		int H = 8;
		System.out.println(n.minEatingSpeed(piles, H));
	}
}
