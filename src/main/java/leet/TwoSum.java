package leet;

import java.util.*;

public class TwoSum {
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
