package leet.next;

import java.util.Arrays;

/**
 Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

 For example,
 Given [3,2,1,5,6,4] and k = 2, return 5.

 Note:
 You may assume k is always valid, 1 ≤ k ≤ array's length.

 Credits:
 Special thanks to @mithmatt for adding this problem and creating all test cases.
 */
/*
这个解法有点作弊了啊。。。
大家评价比较高的是快拍改进过来的选择算法，请移步https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/
可以达到O(N)的复杂度

Arrays.sort只有O(n log(n))啊
 */
public class _215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}