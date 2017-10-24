package leet.next;

import util.TreeNode;

/**
 Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

 Example:
 Given a binary tree
     1
    / \
   2   3
  / \
 4   5
 Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

 Note: The length of path between two nodes is represented by the number of edges between them.
 */

/*
没注意到的点：
1. 最长的路径不就是左右子树的最远点的那个距离么，所以就是求左右子树的最大高度和
1. 但是！！！这是一个递归的过程，并不是只求根节点的左右子树，有可能某个子节点的左右子树的高度加起来才是最大的
因此，我们其实是在求最大高度的递归算法的基础上，加上一个max，来记录每一个节点的左右子树的高度和
 */

public class _543_Diameter_of_Binary_Tree {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getMaxHeight(root);
        return max;
    }

    private int getMaxHeight(TreeNode node) {
        if (node == null) return 0;
        int left = getMaxHeight(node.left);
        int right = getMaxHeight(node.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
