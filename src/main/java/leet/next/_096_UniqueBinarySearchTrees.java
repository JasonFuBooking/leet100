package leet.next;

/**
 Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

 For example,
 Given n = 3, there are a total of 5 unique BST's.

 1         3     3      2       1
  \       /     /      /  \      \
  3     2     1      1     3      2
  /     /       \                 \
 2     1         2                 3
 */

/*
这道题说简单也不简单说难也不难，还是蛮符合黄色的难度。
看到题目肯定是dp了，具体问题就是怎么考虑递推公式。

1. 首先，dp[1] = 1, dp[2] = 2 这个是肯定的，都很简单

2. 我们看看dp[3]. 有三个节点的时候，怎么求解呢，这就是最最关键的点，我们可以这样求：
   2.1 先把1作为根节点，因为BST是有序的，所有2，3只能放在右子树，2，3有多少种情况呢？其实就是dp[2]=2
   2.2 再把2作为根节点，同理，1只能放在左子树，3只能放在右子树，因此就是dp[1]*dp[1]=1
   2.3 再把3作为根节点，同理，1，2，只能放在左子树，就是dp[2]=2
   最后再把所有的结果求和：2+1+2=5
   这样做还保证了没有重复解，因为根节点不同，所以得BST肯定是不同的

3. 抽象一点就是：对于1...n个节点的数组，我们可以分别以每个元素作为根节点，最后把每个节点取得的个数加起来即可。
dp[n] = dp[n-1] + dp[n-2]*dp[1] + ... + dp[1]*dp[n-2] + dp[n-1]
为了计算方便，我们可以给首位的两个元素加上dp[0] = 1
dp[n] = dp[n-1]*dp[0]+ dp[n-2]*dp[1] + ... + dp[1]*dp[n-2] + dp[0]*dp[n-1]
这样就很清楚了

4. 这里要注意的就是45行开始的双重嵌套循环，为了逐个计算1...n 。内层循环是为了求取当前i的dp值

 */
public class _096_UniqueBinarySearchTrees {
    public int numTrees(int n) {
        if (n < 3) return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; ++i) {
            int sum = 0;
            for (int j = 0; j < i; ++j) {
                sum += dp[j] * dp[i - j - 1];
            }
            dp[i] = sum;
        }
        return dp[n];
    }
}

