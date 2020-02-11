package leetcode.no200_299;

import java.util.PriorityQueue;

public class No264_丑数 {
	public int nthUglyNumber(int n) {
		int[] ele = new int[] { 2, 3, 5 };
		PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
		long[] res = new long[n];
		res[0] = 1;

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < ele.length; j++) {
				// 用int存数据的时候，有些溢出的数据被堆排到了堆顶，用long可以避免溢出
				if (!priorityQueue.contains((long) (res[i] * ele[j]))) {
					priorityQueue.add((long) (res[i] * ele[j]));
				}
			}
			if (i + 1 < res.length) {
				res[i + 1] = priorityQueue.poll();
			}
		}
//        System.out.println(Arrays.toString(res));
		return (int) res[n - 1];
	}

}
