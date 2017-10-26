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

/*
思路：
一开始是两个指针，一个在头一个在尾，向中间遍历。但是这样不能保持顺序
还是从头遍历，遇到0就新建另一个指针，从当前位置之后开始寻找非零数，并交换
这样就可以保持顺序
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
