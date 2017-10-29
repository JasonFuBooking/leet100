package leet.next;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees must also be binary search trees.
 Example 1:
 2
 / \
 1   3
 Binary tree [2,1,3], return true.
 Example 2:
 1
 / \
 2   3
 Binary tree [1,2,3], return false.
 */

/*
因为先做了中序非递归的题，这一道就很顺理成章了。
关键思路：BST的中序遍历是一个升序数组。
我看最优的解法是非递归中序遍历过程中，顺便判断一下是不是升序。
我这里用了一个辅助数组。

 */
public class _098_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node);
            node = node.right;
        }
        boolean isInOrder = true;
        for (int i = 0; i < list.size() - 1; ++i) {
            if (list.get(i).val >= list.get(i + 1).val) {
                isInOrder = false;
                break;
            }
        }
        return isInOrder;
    }
}
