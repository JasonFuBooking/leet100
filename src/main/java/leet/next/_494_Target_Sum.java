package leet.next;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.

 Find out how many ways to assign symbols to make sum of integers equal to target S.

 Example 1:
 Input: nums is [1, 1, 1, 1, 1], S is 3.
 Output: 5
 Explanation:

 -1+1+1+1+1 = 3
 +1-1+1+1+1 = 3
 +1+1-1+1+1 = 3
 +1+1+1-1+1 = 3
 +1+1+1+1-1 = 3

 There are 5 ways to assign symbols to make the sum of nums be target 3.
 Note:
 The length of the given array is positive and will not exceed 20.
 The sum of elements in the given array will not exceed 1000.
 Your output answer is guaranteed to be fitted in a 32-bit integer.
 */

/*
看了一下其他人dp的递推公式简直令人发指。

我第一次用了list从头遍历，每一次num[i]便利的结果都保存在list里，最后到n时算一下有多少S。
结果超时了。

所以还是老老实实的用DFS递减搜索吧，S为什么乘以-1呢，因为S在等号右边呀，我最后算的是remain
意思是把S挪到等式左边，最后等式为0，就说明满足了条件。
这一个解法请看注释的部分，也比较好理解. (724ms)


再进一步优化，dfs肯定有很多的重复计算。
这里添加了两个部分
1. 返回值改为int,返回当前结果集和remain的解的总数，所以65行要把他们加起来
2. 增加一个map,用来保存某一个index和remain下的结果集，如果再次遍历到，直接取出即可，不用再搜索了
（243ms）

 */
public class _494_Target_Sum {
    public int findTargetSumWays(int[] nums, int S) {
        return search(nums, 0, S * -1, new HashMap<>());
    }

    private int search(int[] nums, int index, int remain, Map<String, Integer> map) {
        String key = index + "_" + remain;
        if (map.containsKey(key)) return map.get(key);

        if (index == nums.length) {
            if (remain == 0) {
                return 1;
            }
            return 0;
        }
        int countPlus = search(nums, index + 1, remain + nums[index], map);
        int countReduce = search(nums, index + 1, remain - nums[index], map);
        map.put(key, countPlus + countReduce);
        return countPlus + countReduce;
    }

    //    private int count = 0;
//    public int findTargetSumWays(int[] nums, int S) {
//        search(nums, 0, S * -1);
//        return count;
//    }
//
//    private void search(int[] nums, int index, int remain) {
//        if (index == nums.length) {
//            if (remain == 0) {
//                ++count;
//            }
//            return;
//        }
//        search(nums, index + 1, remain + nums[index]);
//        search(nums, index + 1, remain - nums[index]);
//    }
}
