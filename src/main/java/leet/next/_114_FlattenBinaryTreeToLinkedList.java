package leet.next;

import util.TreeNode;

import java.util.*;

/**
 Given a binary tree, flatten it to a linked list in-place.

 For example,
 Given

     1
    / \
   2   5
  / \   \
 3   4   6
 The flattened tree should look like:
 1
  \
   2
     \
         3
             \
                 4
                     \
                         5
                             \
                              6
 click to show hints.

 Hints:
 If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
 */

/*
因为用了stack和list，所以执行时间变成了20ms。。。
大家都在用递归的直接改

这里用的是前序遍历的非递归，最后在统一修改指针的方法

 */
public class _114_FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) return;
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
           while (node != null) {
               list.add(node);
               stack.push(node);
               node = node.left;
           }
           node = stack.pop();
           node = node.right;
        }

        for (int i = 0; i < list.size() - 1; ++i) {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }
        list.get(list.size() - 1).left = null;
        list.get(list.size() - 1).right = null;
    }
}
