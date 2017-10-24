package leet.next;

import util.TreeNode;

/**
 Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

 You need to mergeToT2 them into a new binary tree. The mergeToT2 rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

 Example 1:
 Input:
 Tree 1                     Tree 2
    1                         2
   / \                       / \
  3   2                     1   3
 /                           \   \
 5                            4   7
 Output:
 Merged tree:
     3
    / \
   4   5
  / \   \
 5   4   7
 Note: The merging process must start from the root nodes of both trees.
 */

/*
思路：
这道题是以遍历t1为主，顺便遍历t2
遍历的过程中把t1的元素拷贝或者复制到t2
最后返回t2的根节点即可
 */
public class _617_Merge_Two_Binary_Trees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        mergeToT2(t1, t2);
        return t2;
    }

    private void mergeToT2(TreeNode t1, TreeNode t2) {
        t2.val = t2.val + t1.val;
        if (t1.left != null) {
            if (t2.left == null) {
                t2.left = new TreeNode(0);
            }
            mergeToT2(t1.left, t2.left);
        }
        if (t1.right != null) {
            if (t2.right == null) {
                t2.right = new TreeNode(0);
            }
            mergeToT2(t1.right, t2.right);
        }
    }
}
