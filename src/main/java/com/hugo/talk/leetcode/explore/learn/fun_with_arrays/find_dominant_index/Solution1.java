package com.hugo.talk.leetcode.explore.learn.fun_with_arrays.find_dominant_index;

public class Solution1 {
	public static void main(String[] args) {
		int[] nums = {3, 6, 1, 0};
		int result = dominantIndex(nums);
		System.out.println(result);
	}

	public static int dominantIndex(int[] nums) {
		int tmp = 0, max = 0, secondMax = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				secondMax = max;
				max = nums[i];
				tmp = i;
			} else if (secondMax < nums[i]) {
				secondMax = nums[i];
			}
		}
		if (max >= secondMax * 2) {
			return tmp;
		} else {
			return -1;
		}
	}
}
