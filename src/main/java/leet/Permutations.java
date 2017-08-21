package leet;

import java.util.ArrayList;
import java.util.List;

/*
Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */

/*
看了讨论才知道大部分人用的递归，想想也是。
我的思路是反过来，一开始我想是不是DP呀，如果知道了n-1的结果集，怎么求n呢
实际上就是把第n个元素一次插入到n-1所有结果列表的每一个位置。这样就就得到了n的结果集
所以我仿照dp的思路,从第1个元素开始，元素为1是结果集自然只有1个list，里边包含了这个元素
到第2个元素的时候，就要把第二个元素插入到前一个结果集的每一个位置，也就是2,1 和1,2
使用的方法就是借助list的add(index, value)

第三个元素的时候，就是把当前元素插入到前边结果集（2个list）中，每个list的所有位置。
以此类推。
用了三重循环。

 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        List<Integer> listOne = new ArrayList<>();
        listOne.add(nums[0]);
        result.add(listOne);

        for (int i = 1; i < nums.length; ++i) {
            List<List<Integer>> tempResult = new ArrayList<>();
            for (int j = 0; j < result.size(); ++j) {
                List<Integer> row = result.get(j);
                for (int k = 0; k <= row.size(); ++k) {
                    List<Integer> newRow = new ArrayList<>();
                    newRow.addAll(row);
                    newRow.add(k, nums[i]);
                    tempResult.add(newRow);
                }
            }
            result.clear();
            result.addAll(tempResult);
        }

        return result;
    }
}
