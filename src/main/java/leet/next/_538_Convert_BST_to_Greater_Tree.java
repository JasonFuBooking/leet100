package leet.next;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

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

/*
这一题的思路相对简单。
中序遍历BST是一个有序序列。
然后再倒序依次累加即可。
 */
public class _538_Convert_BST_to_Greater_Tree {
    public TreeNode convertBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        traverse(root, list);
        for (int i = list.size() - 1; i > 0; --i) {
            list.get(i - 1).val += list.get(i).val;
        }
        return root;
    }

    private void traverse(TreeNode node, List<TreeNode> list) {
        if (node == null) return;
        traverse(node.left, list);
        list.add(node);
        traverse(node.right, list);
    }
}
