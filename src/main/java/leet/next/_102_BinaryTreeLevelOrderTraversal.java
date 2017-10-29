package leet.next;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
  3
 / \
 9  20
   /  \
  15   7
 return its level order traversal as:
 [
     [3],
     [9,20],
     [15,7]
 ]
 */

/*
借助queue进行层次遍历，这没啥好说的，基础算法
 */
public class _102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            List<TreeNode> nextLevel = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            result.add(currentLevel);
            queue.addAll(nextLevel);
        }
        return result;
    }
}