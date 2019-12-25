package com.programmer.talk.longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Hsiung
 * @Date: 2019/12/25 12:08
 * @Description 3.无重复字符的最长子串
 * 暴力解法
 * 时间复杂度：O(n^3)
 * @topic 字符串
 */
public class Solution1 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		// 字符串长度
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (allUnique(s, i, j)) {
					ans = Math.max(ans, j - i);
				}
			}
		}
		return ans;
	}

	public boolean allUnique(String s, int start, int end) {
		/**
		 * 利用HashSet判断是否包含重复字符
		 */
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;
	}
}
