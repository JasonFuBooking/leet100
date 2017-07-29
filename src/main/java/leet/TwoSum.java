package leet;

import java.util.*;

public class TwoSum {
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
