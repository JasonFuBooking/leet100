package leet;

import java.util.*;

public class TwoSum {
    /*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
     */
    
    /*
    借助Set先把所有的元素存储起来
    因为是两位数相加，依次遍历数组，用target减去当前元素，即为要找的另一个元素，再去Set查询一下就知道存不存在了。
    如果存在，就可以从当前元素往后遍历来寻找。
     */
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i = 0; i < nums.length; ++i) {
            int currentValue = nums[i];
            if (set.contains(target - currentValue)) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[j] == (target - currentValue)) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }
}
