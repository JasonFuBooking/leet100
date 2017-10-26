package leet.next;

/**
 Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

 */
public class _283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[i] == 0) {
                j = i + 1;
                while (j < nums.length && nums[j] == 0) ++j;
                if (j > nums.length - 1) break;
                int number = nums[j];
                nums[j] = nums[i];
                nums[i] = number;
            }
            ++i;
        }
    }
}
