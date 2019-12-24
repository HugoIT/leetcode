package com.programmer.talk.two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hugo
 * @date 2019/12/25
 * @description 利用哈希表
 */
public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        /**
         * 1.异常情况判断
         */
        if (nums == null || nums.length < 2) {
            throw new RuntimeException("wrong nums");
        }
        /**
         * 2.利用哈希表，存储数组：key放数组值，value放坐标值
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            /**
             * 利用集合方法判断
             */
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                /**
                 * 关键步骤
                 */
                map.put(target - nums[i], i);
            }
        }
        throw new RuntimeException("no target");
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        int b = 6;
        new Solution3().twoSum(a, b);
    }
}
