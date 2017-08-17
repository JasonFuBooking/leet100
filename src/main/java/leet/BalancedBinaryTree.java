package leet;

import util.TreeNode;

/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */

/*
基本思路：其实就是一个深度计算递归，顺便保存一下左右相差的最大值
第一次做的时候忘记30行返回的时候要+1，否则深度计算不对
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int[] maxDifference = new int[1];
        maxDifference[0] = 0;
        findHeight(root, maxDifference);
        return maxDifference[0] <= 1;
    }

    private int findHeight(TreeNode node, int[] maxDiff) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        int left = findHeight(node.left, maxDiff);
        int right = findHeight(node.right, maxDiff);
        maxDiff[0] = Math.max(maxDiff[0], Math.abs(left - right));
        return Math.max(left, right) + 1;
    }
}
