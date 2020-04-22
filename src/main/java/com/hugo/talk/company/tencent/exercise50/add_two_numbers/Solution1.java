package com.hugo.talk.company.tencent.exercise50.add_two_numbers;

/**
 * @author hugo0129
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution1 {
	public static void main(String[] args) {

	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode p1 = l1;
		ListNode p2 = l2;
		// 初始节点
		ListNode dummyHead = new ListNode(-1);
		ListNode current = dummyHead;
		// 进位值
		int carry = 0;
		while (p1.next != null || p2.next != null) {
			int a = p1.val > 0 ? p1.val : 0;
			int b = p2.val > 0 ? p2.val : 0;
			current.next = new ListNode((a + b + carry) % 10);
			current = current.next;


		}


		return null;
	}


}
