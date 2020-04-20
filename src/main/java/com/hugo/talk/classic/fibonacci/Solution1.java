package com.hugo.talk.classic.fibonacci;

/**
 * @author hugo0129
 * @description 斐波那契数列
 * 简单递归方式
 */
public class Solution1 {
	public static void main(String[] args) {
		int n = 20;
		int result = fibonacci(n);
		System.out.println(result);
	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
