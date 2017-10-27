package leet.next;

/**
 Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

 Your algorithm's runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 For example,
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].
 */
/*
这道题一拿到可能都在想怎么用二分比较好。
但是当我看到这个同学的答案真的震惊了！！！
他用了两次二分就分别找到了左右边界节点，虽然没有其他的答案简单，但是胜在容易理解
这两个函数非常像，唯一的区别就是35和50行。把target == nums[mid]的情况分到了left或者right
这里的二分查找也不是很标准，标准的看最后
 */

public class _034_SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = searchLeft(nums, target);
        result[1] = searchRight(nums, target);
        return result;
    }

    private int searchRight(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target >= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (target == nums[mid]) index = mid;
        }
        return index;
    }

    private int searchLeft(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (target == nums[mid]) index = mid;
        }
        return index;
    }

    public static int search(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

}