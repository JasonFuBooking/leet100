package leet.next;

import java.util.Stack;

/**
 A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

 The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

 How many possible unique paths are there?


 Above is a 3 x 7 grid. How many possible unique paths are there?

 Note: m and n will be at most 100.
 x
 */

/*
一开始用了类似3sum的递归枚举所有情况的方法，结果超时了。。。。
看来还是得用dp，稍微研究了一下，

这个题关键的点就在于："只能向下或者向右移动"
翻过来想想，对于dp[n][m]的最优解，它就只能是dp[n-1][m] + dp[n][m-1]之和（自己画个图就知道了）
递推公式就出来啦。

我失误的地方在于33到38行，对于单独一行或者一列的情况，要记得都初始化为1
 */
public class _062_UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; ++i) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}