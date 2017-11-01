package leet.next;

/**
 Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].

 Follow up:
 Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */

/*
思路就是预先算出左半边和右半边，再遍历相乘即可，时间复杂度为O(n)
进一步要求的空间复杂度为常数，有的解法是把计算的过程直接填在result里。。。

 */
public class _238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int[] productRight = new int[nums.length];
        productRight[nums.length - 1] = nums[nums.length - 1];
        for (int i  = nums.length - 2; i >=0; --i) {
            productRight[i] = nums[i] * productRight[i + 1];
        }

        int[] productLeft = new int[nums.length];
        productLeft[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            productLeft[i] = nums[i] * productLeft[i - 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            int left = i - 1 < 0 ? 1 : productLeft[i - 1];
            int right = i + 1 >= nums.length ? 1 : productRight[i + 1];
            result[i] = left * right;
        }
        return result;
    }
}