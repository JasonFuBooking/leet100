package leet;

/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */

/*
dp的关键就是怎么划分子问题
假设我们现在要求i位置的最优解dp[i]，它是怎么根据dp[i-1]得到的呢？
因为是连续的，dp[i]的值只有两种情况，要么dp[i - 1] + nums[i],  要么不加
什么时候加呢，当然是dp[i - 1]不为负数，要不加上整个和就变小了。

所以做法就是使用一个单独的数组保存每一步的最优解，然后从头遍历到尾就可以了。
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int maxSum = nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            dp[i] = dp[i - 1] < 0 ? nums[i] : dp[i - 1] + nums[i];
            maxSum = Math.max(dp[i], maxSum);
        }
        return maxSum;
    }
}
