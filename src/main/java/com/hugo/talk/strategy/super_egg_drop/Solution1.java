package com.hugo.talk.strategy.super_egg_drop;

/**
 * @author hugo0129
 * 记忆搜索法
 */
public class Solution1 {
	public static void main(String[] args) {
		int K = 2, N = 100;
		int result = dp(K, N);
		System.out.println("100层楼，2个鸡蛋，最多需要:" + result);
	}

	/**
	 * 计算最少移动次数
	 *
	 * @param K
	 * @param N
	 * @return
	 */
	private static int dp(int K, int N) {
		if (K == 1) {
			return N;
		}
		if (N == 0) {
			return 0;
		}
		int res = 1;
		for (int i = 1; i < N; i++) {
			// 最坏情况下的最少扔鸡蛋次数
			int max = Math.max(dp(K - 1, i - 1),
					dp(K, N - 1)) + 1;
			res = Math.min(res, max);
			System.out.println("==============" + res + "==============");
		}
		return res;
	}

}
