package leet;

/**
 * Created by jafu on 8/10/17.
 */

/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */

/*
因为就算是线性的算法，也不过是O(N)的复杂度，所有按顺序搜索也可通过OJ
可能二分更快一些把，要注意33 35行，二分查找不要写错了。
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        if (target < nums[low]) return 0;
        if (target > nums[high]) return nums.length;
        while (low < high) {
            int midIndex = (low + high) / 2;
            int mid = nums[midIndex];
            if (mid == target) return midIndex;
            if (target < mid) {
                high = midIndex - 1;
            } else {
                low = midIndex + 1;
            }
        }
        if (target <= nums[low]) {
            return low;
        } else {
            return low + 1;
        }
    }

    public int searchInsert2(int[] nums, int target) {
        if (target <= nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == target) {
                return i;
            }
            if (target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
