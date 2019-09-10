package offer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main_µÝÔöÊý {
	private static void isIncrsTree(Node head) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(head);
		int cur = 1;
		int next = 0;
		int per = 0;
		int cnt = 0;
		while (!queue.isEmpty()) {
			Node currout = queue.poll();
			cur--;
			cnt += currout.value;
			if (currout.l != null) {
				queue.add(currout.l);
				next++;
			}
			if (currout.r != null) {
				queue.add(currout.r);
				next++;
			}
			if (cur == 0) {
				cur = next;
				next = 0;
				if (cnt <= per) {
					System.out.println("NO");
					return;
				} else {
					per = cnt;
					cnt = 0;
				}
			}
		}
		System.out.println("YES");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			boolean[] isChild = new boolean[n];
			Map<Integer, Node> numToNodeMap = new HashMap<Integer, Node>();
			numToNodeMap.put(-1, null);
			for (int j = 0; j < n; j++) {
				numToNodeMap.put(j, new Node());
			}
			for (int j = 0; j < n; j++) {
				Node cur = numToNodeMap.get(j);
				cur.value = sc.nextInt();
				int l = sc.nextInt();
				int r = sc.nextInt();
				cur.l = numToNodeMap.get(l);
				cur.r = numToNodeMap.get(r);
				if (l != -1)
					isChild[l] = true;
				if (r != -1)
					isChild[r] = true;
			}
			int head = -1;
			for (int j = 0; j < isChild.length; j++) {
				if (!isChild[j])
					head = j;
			}
			isIncrsTree(numToNodeMap.get(head));
		}
		sc.close();
	}

}

class Node {
	public int value;
	public Node l;
	public Node r;
}