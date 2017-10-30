package leet.next;

/**
 Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.
 */
public class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            int max = nums[i];
            if (nums[i] == nums[i - 1] + 1) {
                max = Math.max(max, nums[i] * dp[i - 1]);
            } else {
                max = Math.max(max, dp[i - 1]);
            }
            dp[i] = max;
        }
        return dp[nums.length - 1];
    }
}
