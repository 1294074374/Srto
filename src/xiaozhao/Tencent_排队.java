package xiaozhao;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Tencent_ее╤с {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Heap> queue = new PriorityQueue<>(new HeapComparator());
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Heap cur = new Heap(a, b);
			queue.add(cur);
		}
		int res = 0;
		for (int i = 1; i <= n; i++) {
			Heap cur = queue.poll();
			res += (i - 1) * cur.a + (n - i) * cur.b;
		}
		System.out.println(res);
		sc.close();
	}

	public static class Heap {
		int a;
		int b;

		public Heap(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	public static class HeapComparator implements Comparator<Heap> {
		@Override
		public int compare(Heap o1, Heap o2) {
			Heap max = o1.a >= o2.a ? o1 : o2;
			Heap min = max == o1 ? o2 : o1;
			if (max.b <= min.b) {
				return max.a != min.a ? min.a - max.a : max.b - min.b;
			}
			if (max.a - min.a < max.b - min.b) {
				return max.a - min.a;
			} else {
				return min.a - max.a;
			}
		}
	}

}