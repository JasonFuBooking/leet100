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
先说最简单的思路：
和2sum一样，只不过我们先取定一个元素，乘以-1,然后从后边的剩余的数组里找两个数，求和，看和乘-1之后的数是否相等，相等就是一个解。
可以看到其实思路是和2sum一样的。只不过外层循环时遍历整个数组，内层循环是遍历当前值后边剩余的数组部分。

为了提高效率， 做了以下优化：
1. 34行，先对数组排序，方便在内存循环的时候可以让两个指针从两边向里遍历
2. 37行和48，49行，都是为了跳过重复的值，以免出现重复解

我一开始没有使用第2个优化，使用了一个hashmap来去重，结果效率差异还蛮大的。hashmap比较简单，每次得到一个解就按照字符串形式存起来。
 */
public class _015_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; ++i) {
            if (i == 0 || (nums[i] != nums[i-1])) {
                int value = -nums[i];
                int j = i + 1, k = nums.length - 1;
                while (j < k) {
                    int sum = nums[j] + nums[k];
                    if (sum == value) {
                        List<Integer> list = new ArrayList<>(3);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        results.add(list);
                        while (j < k && nums[j] == nums[j + 1]) ++j;
                        while (k > j && nums[k] == nums[k - 1]) --k;
                        ++j;
                        --k;
                    } else if (sum > value) {
                        --k;
                    } else {
                        ++j;
                    }
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