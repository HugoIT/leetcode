package com.programmer.talk.two_sum;

/**
 * @Author: Hsiung
 * @Date: 2019/12/23 16:32
 * @Description 两数之和
 * 时间复杂度：O(n^2)
 */
public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int size = nums.length;
		int[] a = new int[2];
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (nums[i] + nums[j] == target) {
					a[0] = i;
					a[1] = j;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] array = {2, 7, 11, 15};
		int target = 9;
		new Solution1().twoSum(array, target);
	}
}
