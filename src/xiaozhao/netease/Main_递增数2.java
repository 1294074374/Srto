package xiaozhao.netease;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main_µÝÔöÊý2 {
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
				int left = sc.nextInt();
				int right = sc.nextInt();
				cur.left = numToNodeMap.get(left);
				cur.right = numToNodeMap.get(right);
				if (left != -1)
					isChild[left] = true;
				if (right != -1)
					isChild[right] = true;
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

	private static void isIncrsTree(Node head) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(head);
		int curLevel = 1;
		int nextLevel = 0;
		int pre = 0;
		int sum = 0;
		while (!queue.isEmpty()) {
			Node cur = queue.poll();
			curLevel--;
			sum += cur.value;
			if (cur.left != null) {
				queue.add(cur.left);
				nextLevel++;
			}
			if (cur.right != null) {
				queue.add(cur.right);
				nextLevel++;
			}
			if (curLevel == 0) {
				curLevel = nextLevel;
				nextLevel = 0;
				if (sum <= pre) {
					System.out.println("NO");
					return;
				} else {
					pre = sum;
					sum = 0;
				}
			}
		}
		System.out.println("YES");
	}
}
