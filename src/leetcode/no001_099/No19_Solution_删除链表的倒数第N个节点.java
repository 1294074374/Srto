package leetcode.no001_099;

import leetcode.util.ListNode;

public class No19_Solution_删除链表的倒数第N个节点 {
	public static void main(String[] args) {
		No19_Solution_删除链表的倒数第N个节点 s = new No19_Solution_删除链表的倒数第N个节点();
		ListNode l11 = new ListNode(2);

		System.out.println(s.removeNthFromEnd(l11, 1));
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// 获取链表长度
		int listLength = 0;
		ListNode tempNode = head;
		while (tempNode != null) {
			listLength++;
			tempNode = tempNode.next;
		}
		
		if(listLength ==1 && n==1) {
			return null;
		}
		//当需要删除的结点为头结点时 直接返回头结点的下一个结点
        if(listLength == n){
            return head.next;
        }
     // 需要删除结点的前一个结点
		int cut = listLength - n - 1;
		ListNode cupList = head;
		for (int i = 1; i <= cut; i++) {
			cupList = cupList.next;
		}
		System.out.println(listLength);
		//删除结点
		cupList.next = cupList.next.next;
		return head;
	}
}
