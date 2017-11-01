package leet.next;

import java.util.*;

/**
 Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

 For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

 Credits:
 Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */

/*
我已开始dfs怎么剪枝都不行啊哭

简略的算法用了四平方和定理。。
当然还有dp，

 */
public class _279_Perfect_Squares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= n; ++i) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while(i - j*j >= 0) {
                min = Math.min(min, dp[i - j*j] + 1);
                ++j;
            }
            dp[i] = min;
        }
        return dp[n];
    }

//    public int numSquares(int n) {
//        List<Integer> numbers = new LinkedList<>();
//        for (int i = 1; i < n; ++i) {
//            int square = i * i;
//            if (square > n) break;
//            numbers.add(0, square);
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        int[] min = new int[1];
//        min[0] = n;
//        search(numbers, n, stack, min);
//        return min[0];
//    }
//
//    private void search(List<Integer> numbers, int remain, Stack<Integer> stack, int[] min) {
//        if (remain < 0) return;
//        if (remain == 0) {
//            min[0] = Math.min(min[0], stack.size());
//            return;
//        }
//
//        for (int number : numbers) {
//            stack.push(number);
//            if (stack.size() <= min[0]) {
//                search(numbers, remain - number, stack, min);
//            }
//            stack.pop();
//        }
//    }
}