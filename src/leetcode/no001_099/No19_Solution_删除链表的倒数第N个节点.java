package leetcode.no001_099;

import leetcode.util.ListNode;

public class No19_Solution_ɾ������ĵ�����N���ڵ� {
	public static void main(String[] args) {
		No19_Solution_ɾ������ĵ�����N���ڵ� s = new No19_Solution_ɾ������ĵ�����N���ڵ�();
		ListNode l11 = new ListNode(2);

		System.out.println(s.removeNthFromEnd(l11, 1));
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// ��ȡ������
		int listLength = 0;
		ListNode tempNode = head;
		while (tempNode != null) {
			listLength++;
			tempNode = tempNode.next;
		}
		
		if(listLength ==1 && n==1) {
			return null;
		}
		//����Ҫɾ���Ľ��Ϊͷ���ʱ ֱ�ӷ���ͷ������һ�����
        if(listLength == n){
            return head.next;
        }
     // ��Ҫɾ������ǰһ�����
		int cut = listLength - n - 1;
		ListNode cupList = head;
		for (int i = 1; i <= cut; i++) {
			cupList = cupList.next;
		}
		System.out.println(listLength);
		//ɾ�����
		cupList.next = cupList.next.next;
		return head;
	}
}
