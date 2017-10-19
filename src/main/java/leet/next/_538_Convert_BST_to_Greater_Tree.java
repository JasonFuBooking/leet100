package leet.next;

import util.TreeNode;

/**
 Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

 Example:

 Input: The root of a Binary Search Tree like this:
     5
   /   \
 2     13

 Output: The root of a Greater Tree like this:
    18
   /   \
 20     13
 */
public class _538_Convert_BST_to_Greater_Tree {
    public TreeNode convertBST(TreeNode root) {
        return null;
    }
}

/*

Idea: Reversely traverse the tree and keep a sum of all previously visited values. Because its a BST, values seen before are all greater than current node.val. That's what we want according to the problem.

public class Solution {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;

        convertBST(root.right);

        root.val += sum;
        sum = root.val;

        convertBST(root.left);

        return root;
    }
}
 */