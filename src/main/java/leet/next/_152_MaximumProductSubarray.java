package leet.next;

/**
 Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.
 */

/*z
这道题有两个点我失误了。
1. 有负数的存在，所以要同时设置一个dp_min来保存最小值，防止负负得正
2. 在递推的过程中只需要考虑
    a. 当前值i是否加入i-1的最优解 dp_max[i - 1] * nums[i]
    b. 当前值i乘以相反的极值（求dp_max 就乘以 dp_min[i - 1]）
    c. 当前值本身
 */
public class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp_min = new int[nums.length];
        int[] dp_max = new int[nums.length];
        dp_min[0] = nums[0];
        dp_max[0] = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            dp_max[i] = Math.max(Math.max(dp_min[i - 1] * nums[i], dp_max[i - 1] * nums[i]), nums[i]);
            dp_min[i] = Math.min(Math.min(dp_max[i - 1] * nums[i], dp_min[i - 1] * nums[i]), nums[i]);
            result = Math.max(result, dp_max[i]);
        }
        return result;
    }
}
