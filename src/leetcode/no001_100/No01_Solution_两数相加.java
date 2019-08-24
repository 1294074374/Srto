/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package leetcode.no001_100;

import java.util.ArrayList;

public class No01_Solution_两数相加 {
	public static void main(String[] args) {
//		ListNode l11 = new ListNode(2);
//		ListNode l12 = new ListNode(4);
//		ListNode l13 = new ListNode(3);
//		l11.next = l12;
//		l12.next = l13;
//
//		ListNode l21 = new ListNode(5);
//		ListNode l22 = new ListNode(6);
//		ListNode l23 = new ListNode(4);
//		l21.next = l22;
//		l22.next = l23;
		ListNode l11 = new ListNode(9);
		
		ListNode l21 = new ListNode(1);
		ListNode l22 = new ListNode(9);
		ListNode l23 = new ListNode(9);
		ListNode l24 = new ListNode(9);
		ListNode l25 = new ListNode(9);
		ListNode l26 = new ListNode(9);
		ListNode l27 = new ListNode(9);
		ListNode l28 = new ListNode(9);
		ListNode l29 = new ListNode(9);
		ListNode l30 = new ListNode(9);
		l21.next = l22;
		l22.next = l23;
		l23.next = l24;
		l24.next = l25;
		l25.next = l26;
		l26.next = l27;
		l27.next = l28;
		l28.next = l29;
		l29.next = l30;
		No01_Solution_两数相加 s = new No01_Solution_两数相加();
		s.addTwoNumbers(l11, l21);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		while (l1 != null) {
			list1.add(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			list2.add(l2.val);
			l2 = l2.next;
		}
		long add1 = 0;
		long add2 = 0;
		for (int i = list1.size() - 1; i > -1; i--) {
			add1 = add1 * 10 + list1.get(i);
		}
		for (int i = list2.size() - 1; i > -1; i--) {
			add2 = add2 * 10 + list2.get(i);
		}
		long res = add1 + add2;

		//System.out.println(res);
		Long t = res%10;
		ListNode head = new ListNode(t.intValue());

		ListNode resNode = head;
		res = res / 10;
		while (res != 0) {
			Long te = res%10;
			ListNode temp = new ListNode(te.intValue());
			res = res / 10;
			head.next = temp;
			head = head.next;
		}
		return resNode;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
