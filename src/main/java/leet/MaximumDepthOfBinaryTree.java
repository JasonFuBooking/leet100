package leet;

import util.TreeNode;

/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 */

/*
一开始想用按层次遍历，
想想还是递归简单，时间复杂度也是O(N)
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int[] max = new int[1];
        max[0] = 1;
        findMaxLength(1, max, root.left, root.right);
        return max[0];
    }

    private void findMaxLength(int currentMax, int[] max, TreeNode left, TreeNode right) {
        if (left == null && right == null) return;
        ++currentMax;
        max[0] = Math.max(currentMax, max[0]);
        if (left != null) {
            findMaxLength(currentMax, max, left.left, left.right);
        }
        if (right != null) {
            findMaxLength(currentMax, max, right.left, right.right);
        }
    }
}
