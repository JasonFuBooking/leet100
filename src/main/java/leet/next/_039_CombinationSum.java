package leet.next;

import java.util.*;

/**
 Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 The solution set must not contain duplicate combinations.
 For example, given candidate set [2, 3, 6, 7] and target 7,
 A solution set is:
 [
 [7],
 [2, 2, 3]
 ]
 */

/*
因为同一元素可以重复，所以稍微麻烦点。
思路就是借助循环和递归遍历所有情况
注意50行是从0开始，用来遍历自身重复的情况，44行保证了不会无限递归。46行保存结果集，一定要记得53行出栈

 */
public class _039_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        sum(candidates, target, result, new LinkedList<>());

        Set<List<Integer>> set = new HashSet<>();
        for (List<Integer> list : result) {
            Collections.sort(list);
            set.add(list);
        }
        result.clear();
        result.addAll(set);
        return result;
    }

    private void sum(int[] candidates, int remain, List<List<Integer>> result, List<Integer> list) {
        if (remain < 0) return;
        if (remain == 0) {
            result.add(new LinkedList<>(list));
            return;
        }

        for (int i = 0; i < candidates.length && remain >= candidates[i]; ++i) {
            list.add(candidates[i]);
            sum(candidates, remain - candidates[i], result, list);
            list.remove(list.size() - 1);
        }
    }
}