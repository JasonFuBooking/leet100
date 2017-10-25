package leet.next;

import java.util.ArrayList;
import java.util.List;

/**
 Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]
 */

/*
这道题当然有一个最直接的解法，就是建立一个辅助数组，遍历一遍就可以了，但是空间复杂度是n
如果要做到不借助额外的辅助空间。在原数组上寻找的话。
这里借助了负号，最关键的是34行，把当前值映射到index,把该index的值转换成负数，表明该值已经存在。
Math.abs又保证了对当前值的比较不会出错，做到了一个数组两用

 */

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int value = Math.abs(nums[i]) - 1;
            if (nums[value] > 0) {
                nums[value] *= -1;
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }
}