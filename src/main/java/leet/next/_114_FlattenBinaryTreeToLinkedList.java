package leet.next;

import util.TreeNode;

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
public class _114_FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {

    }
}

/*
it is DFS so u need a stack. Dont forget to set the left child to null, or u'll get TLE. (tricky!)

   public void flatten(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        while (!stk.isEmpty()){
            TreeNode curr = stk.pop();
            if (curr.right!=null)
                 stk.push(curr.right);
            if (curr.left!=null)
                 stk.push(curr.left);
            if (!stk.isEmpty())
                 curr.right = stk.peek();
            curr.left = null;  // dont forget this!!
        }
    }
 */
