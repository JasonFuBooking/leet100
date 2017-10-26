package leet.next;

/**
 You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

 Credits:
 Special thanks to @ifanchu for adding this problem and creating all test cases. Also thanks to @ts for adding additional test cases.
 */

/*
这道题一看就是dp，
但是要注意dp的思路
1. 找出递推公式
2. 找的时候不是从整体来看的，而是从小到大的递推，比如只有一个元素的情况，加一个元素到两个元素的情况，在加一个元素呢？
通常需要一个辅助数组来保存前n-1步的最优解

这里来说
只有一个元素，那肯定是选择当前元素
有两个元素，两个里边取大的
有三个元素，因为不能取相邻元素，那就要看：
1. 如果取当前元素，那么最优解，就是当前元素的值加上，dp[n-2]
2, 如果不取当前元素，最优解就是dp[n-1]

dp[n] = max(nums[i] + dp[n-2], dp[n-1])
找到递推公式就好办了

 */
public class _198_House_Robber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; ++i) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }
}