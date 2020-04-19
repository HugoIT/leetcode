package com.hugo.talk.strategy.super_egg_drop;

import java.util.HashMap;
import java.util.Map;

/**
 * #887 https://leetcode-cn.com/problems/super-egg-drop/
 * <p>
 * 1.假设只有1个鸡蛋
 * 2.假设有无限个鸡蛋
 * 3.假设有2个鸡蛋
 * 动态规划：Dynamic programming
 *
 * @author Hugo
 */
public class Solution3 {
	/**
	 * 动态规划
	 *
	 * @param K 鸡蛋个数
	 * @param N 楼层总数
	 * @return 最少移动次数（最少的试验次数）
	 * 寻找F层楼
	 */
	public int superEggDrop(int K, int N) {
		return dp(K, N);
	}

	Map<Integer, Integer> memo = new HashMap();

	public int dp(int K, int N) {
		if (!memo.containsKey(N * 100 + K)) {
			int ans;
			// 0个鸡蛋
			if (N == 0) {
				ans = 0;
			} else if (K == 1) {
				// 1个鸡蛋
				ans = N;
			} else {
				int lo = 1, hi = N;
				/**
				 * 二分法
				 */
				while (lo + 1 < hi) {
					int x = (lo + hi) / 2;
					int t1 = dp(K - 1, x - 1);
					int t2 = dp(K, N - x);

					if (t1 < t2) {
						lo = x;
					} else if (t1 > t2) {
						hi = x;
					} else {
						lo = hi = x;
					}
				}

				ans = 1 + Math.min(Math.max(dp(K - 1, lo - 1), dp(K, N - lo)),
						Math.max(dp(K - 1, hi - 1), dp(K, N - hi)));
			}

			memo.put(N * 100 + K, ans);
		}

		return memo.get(N * 100 + K);
	}

}

