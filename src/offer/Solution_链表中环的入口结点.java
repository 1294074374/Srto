/*
 * ��Ŀ����
��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
 */
package offer;

import java.util.HashMap;

public class Solution_�����л�����ڽ�� {
	public static void main(String[] args) {
		Solution_�����л�����ڽ�� s =new Solution_�����л�����ڽ��();
		ListNode l = new ListNode(1);
		ListNode pHead = l;
		for(int i =2;i<=5;i++) {
			l.next  =new ListNode(i);
			l = l.next;
		}
		l.next =new ListNode(3);
		System.out.println(s.EntryNodeOfLoop(pHead).val);
	}
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		//ListNode tempNode = null;
		HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
		map.put(pHead, 1);
		pHead = pHead.next;
		while (pHead != null) {
			if(map.get(pHead) == null) {
				map.put(pHead, 1);
				pHead = pHead.next;
			}else {
				return pHead;
			}
			
		}
		return null;
	}
}
