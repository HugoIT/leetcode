package com.hugo.talk.company.tencent.exercise50.add_two_numbers;

/**
 * @author hugo0129
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution1 {
	public static void main(String[] args) {

	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 初始节点
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, current = dummyHead;
		// 进位值
		int carry = 0;
		while (p != null || q != null) {
			int a = p != null ? p.val : 0;
			int b = q != null ? q.val : 0;
			current.next = new ListNode((a + b + carry) % 10);
			current = current.next;
			if (p != null) {
				p = p.next;
			}
			if (q != null) {
				q = q.next;
			}
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}
		return dummyHead.next;
	}


}
