package com.programmer.talk.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Hsiung
 * @Date: 2019/12/23 16:58
 * @Description TODO
 */
public class Solution2 {
	public int[] twoSum(int[] nums, int target) {
		int size = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < size; i++) {
			// key：放数组值 value：放坐标
			map.put(nums[i], i);
		}
		for (int i = 0; i < size; i++) {
			Integer j = map.get(target - nums[i]);
			if (j != null && j != i) {
				System.out.println(i + " " + j);
				return new int[]{i, j};
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] a = {3, 2, 4};
		int b = 6;
		new Solution2().twoSum(a, b);
	}
}
