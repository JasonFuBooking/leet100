package leet.next;

import java.util.HashMap;
import java.util.Map;

/**
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.

 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.
 */

/*
思路很简单，遍历一遍使用一个map存储遍历到的key和次数
之后再在map中找
 */
public class _169_Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            Integer count = map.get(i);
            if (count == null) {
                count = 0;
            }
            ++count;
            map.put(i, count);
        }
        int majority = nums.length / 2;
        int max = 0;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majority) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    maxValue = entry.getKey();
                }
            }
        }
        return maxValue;
    }
}
