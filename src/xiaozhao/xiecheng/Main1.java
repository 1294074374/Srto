package xiaozhao.xiecheng;

import java.util.Scanner;

public class Main1 {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	/*
	 * 请完成下面这个函数，实现题目要求的功能 开始写代码
	 ******************************/
	static ListNode partition(ListNode head, int m) {
		if(head.equals(null)) {
			return head;
		}
		if(m<=0) {
			return head;
		}
		ListNode dummyHeadLeft = new ListNode(0);
		ListNode dummyHeadRight = new ListNode(0);
		ListNode nodeLeft = dummyHeadLeft;
		ListNode nodeRight = dummyHeadRight;
		while(head!=null){
            if(head.val <= m){
            	nodeLeft.next = head ;
            	nodeLeft =nodeLeft.next ;
            }else{
            	nodeRight.next= head ;
            	nodeRight = nodeRight.next;
            }
            head = head.next;
        }
		nodeRight.next = null ;
		nodeLeft.next = dummyHeadRight.next;
		return dummyHeadLeft.next;

	}

	/****************************** 结束写代码 ******************************/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ListNode head = null;
		ListNode node = null;
		int m = in.nextInt();
		while (in.hasNextInt()) {
			int v = in.nextInt();
			if (head == null) {
				node = new ListNode(v);
				head = node;
			} else {
				node.next = new ListNode(v);
				node = node.next;
			}
		}
		head = partition(head, m);
		if (head != null) {
			System.out.print(head.val);
			head = head.next;
			while (head != null) {
				System.out.print(",");
				System.out.print(head.val);
				head = head.next;
			}
		}
		System.out.println();
	}
}
