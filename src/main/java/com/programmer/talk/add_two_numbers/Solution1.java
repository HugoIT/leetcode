package com.programmer.talk.add_two_numbers;

/**
 * @Author: Hsiung
 * @Date: 2019/12/25 10:41
 * @Description 2.两数相加
 * @topic 链表、数学
 */
public class Solution1 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 假定头节点；哑结点（初始节点）
		ListNode dummyHead = new ListNode(0);
		// 链表l1头部，l2头部，当前节点初始为假节点
		ListNode p = l1, q = l2, curr = dummyHead;
		// 进位数
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			// 计算sum值
			int sum = x + y + carry;
			// 进位数；取商
			carry = sum / 10;
			// 取余（取模）有个规律就是：左边小于右边，
			// 结果为左边，左边大于右边，看余数 sum mod 10
			curr.next = new ListNode(sum % 10);
			// curr、p、q前进到下一个节点
			curr = curr.next;
			if (p != null) {
				p = p.next;
			}
			if (q != null) {
				q = q.next;
			}
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}
