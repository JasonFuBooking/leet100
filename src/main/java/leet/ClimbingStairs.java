package leet;

/**
 * Created by jafu on 8/10/17.
 */
/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.
 */
/*
本来一开始我在画二叉树，因为只有两种情况嘛，根节点是最大值，左子树减1，右子树减2，同时节点保留当前剩余值
这样当剩余值为0的时候就表示回到台阶底下了，
这样反向构建二叉树，最后收割叶子节点，就是路径的个数。

后来发现其实3的二叉树是由2和1的二叉树组成的，4的二叉树中3的那部分其实就是之前构建的3
也就是说当前的路径图谱是基于前两个的路径图谱，只要加起前两个的值就可以了。

这样的话有点像斐波那契数列，又有点DP的意思。
于是就很简单啦
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int[] steps = new int[n + 1];
        steps[1] = 1;
        steps[2] = 2;
        for (int i = 3; i <= n; ++i) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }
}
