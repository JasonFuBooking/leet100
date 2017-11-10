package leet.next;

/**
 Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 Example:

 Given nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 */

/*
这道题一开始思路想的复杂了一点，
使用两个指针，初始j比i多1。
如果两个数不相等,就i++，如果是相邻的两个数，比如3，4，那么i和j就会重合，28行相当于什么都没有做。
如果有重复的数字，i会移动到第二个重复的数字，并且把后边的不重复的复制过来。
 */
public class _026_Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
