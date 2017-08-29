package leet;

import java.util.ArrayList;
import java.util.List;

/*
Given a set of distinct integers, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */

/*
我反而觉得有那么一点点DP的意思。
从前往后计算，反正每加入一个新的元素，都可以基于前边元素的结果来计算
例如把a加入到前a-1个元素中，那么新的集合包括：
1. []
2. a
3. a 和前边 a-1 中的每一个结果相加组成的新的结果集
4. a -1 本身的所有结果别忘了

这样就形成了递推 的公式啦，分别对应到代码就是：
1. 66 行
2. 60 - 62 行
3. 54 - 57 行
4. 59 行
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(nums[0]);
        result.add(list1);

        for (int i = 1; i < nums.length; ++i) {
            List<List<Integer>> buffer = new ArrayList<>();
            for (List<Integer> preList : result) {
                List<Integer> newList = new ArrayList<>(preList);
                newList.add(nums[i]);
                buffer.add(newList);
            }
            buffer.addAll(result);
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            buffer.add(list);

            result = buffer;
        }
        result.add(new ArrayList<Integer>());
        return result;
    }
}
