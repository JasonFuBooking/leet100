package leet.next;

import java.util.*;

/**
 Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Note: The solution set must not contain duplicate triplets.

 For example, given array S = [-1, 0, 1, 2, -1, -4],

 A solution set is:
 [
     [-1, 0, 1],
     [-1, -1, 2]
 ]
 */

/*
虽然是仿照2sum，但是还是有些需要注意的技巧。
1. 先排序
2. 从头开始遍历，选定当前元素后，在其后的数组部分设置两个指针，从两头向中间步进，并计算和
3. 注意滤掉重复元素: line38
 */
public class _015_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        Arrays.sort(nums);

        Set<String> hash = new HashSet<>();
        for (int i = 0; i < nums.length - 2; ++i) {
            int value = -nums[i];
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == value) {
                    String hashKey = String.valueOf(nums[i]) + nums[j] + nums[k];
                    if (hash.contains(hashKey)) {
                        ++j;
                        --k;
                        continue;
                    }
                    hash.add(hashKey);
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    results.add(list);
                    ++j;
                    --k;
                } else if (sum > value) {
                    --k;
                } else {
                    ++j;
                }
            }
        }
        return results;
    }
}



































/*
Hi guys!

The idea is to sort an input array and then run through all indices of a possible first element of a triplet. For each possible first element we make a standard bi-directional 2Sum sweep of the remaining part of the array. Also we want to skip equal elements to avoid duplicates in the answer without making a set or smth like that.

public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>();
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
    return res;
}
Have a nice coding!
 */