package leet.next;

import util.TreeNode;

/**
 Invert a binary tree.

        4
      /   \
    2     7
   / \   / \
 1   3 6   9
 to
        4
      /   \
    7     2
   / \   / \
 9   6 3   1

 Trivia:
 This problem was inspired by this original tweet by Max Howell:
 Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.
 */

/*
这道题关键的关键就是要看明白翻转的过程可以分解成；
1. 首先根节点的左右子树交换
2. 左右子树的左右子树再分别交换即可
3. 注意35和36行，左右子树单独拿出来先，要不后边两行的赋值就乱了
典型的递归
 */
public class _226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;
    }
}
