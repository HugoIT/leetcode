package com.programmer.talk.longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Hsiung
 * @Date: 2019/12/25 15:49
 * @Description 3.无重复字符的最长子串
 * 滑动窗口解法
 * 时间复杂度：O(n^3)
 * @topic 字符串
 */
public class Solution2 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
}
