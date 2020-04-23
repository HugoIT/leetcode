package com.hugo.talk.leetcode.explore.learn.fun_with_arrays.find_numbers_with_even_number_of_digits;

/**
 * @author hugo0129
 */
public class Solution1 {
	public static void main(String[] args) {
		int[] nums = {1, 7, 3, 6, 5, 6};
		int result = pivotIndex(nums);
		System.out.println(result);
	}

	public static int pivotIndex(int[] nums) {
		if (nums.length < 2) {
			return -1;
		}
		// 1.算出总数
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		// index左边之和
		// index右边之和
		int leftResult = 0, rightResult;
		// 2.穷举
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				leftResult = 0;
			} else {
				leftResult += nums[i - 1];
			}
			rightResult = sum - leftResult - nums[i];
			if (leftResult == rightResult) {
				return i;
			}
		}
		return -1;
	}
}
