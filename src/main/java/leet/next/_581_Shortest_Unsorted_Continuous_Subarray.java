package leet.next;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

 You need to find the shortest such subarray and output its length.

 Example 1:
 Input: [2, 6, 4, 8, 10, 9, 15]
 Output: 5
 Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 Note:
 Then length of the input array is in range [1, 10,000].
 The input array may contain duplicates, so ascending order here means <=.

 */

/*
思路：
第一次想着用两个指针来寻找，但是是由缺陷的，比如2，6，4，3，1，5，7这样的数组就找不出来，因为2其实也不在正确的位置
差一点的方法是先排序，比较排好序的和原数组，复杂度为nlogn
O(n)的方法就是使用栈，左右遍历两次来分别找到需要调整的最左和最右index
 */
public class _581_Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] oldArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int left = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != oldArray[i]) {
                left = i;
                break;
            }
        }
        int right = 0;
        for (int i = nums.length - 1; i >=0; --i) {
            if (nums[i] != oldArray[i]) {
                right = i;
                break;
            }
        }
        if (left == right) return 0;
        return right - left + 1;
    }
}
