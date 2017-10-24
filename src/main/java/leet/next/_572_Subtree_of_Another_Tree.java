package leet.next;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

 Example 1:
 Given tree s:

     3
    / \
   4   5
  / \
 1   2
 Given tree t:
   4
  / \
 1   2
 Return true, because t has the same structure and node values with a subtree of s.
 Example 2:
 Given tree s:

    3
   / \
  4   5
  / \
 1   2
    /
   0
 Given tree t:
   4
  / \
 1   2
 Return false.
 */

/*
思路：
1. 前序遍历两棵树，得到两个遍历string
2. 验证后一个string是不是前边的子串

注意点：
1. 生成遍历字符串的时候，null的叶子节点也要带上，并且区分左右，否则有些子树不是字串的也会在字符串上一样
2. 值前边加一个特殊符号，用来处理这样的特殊情况：
 12       2
 /\      /\
1  2    1  2
不加特殊符号：
"12 1 2" 与 "2 1 2" 第二个的确是第一个的字串，错了
"#12 #1 #2" "#2 #1 #2" 这样就对了

 */
public class _572_Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String sPre = preorderTraverse(s, true);
        String tPre = preorderTraverse(t, true);
        return sPre.indexOf(tPre) >= 0;
    }

    private String preorderTraverse(TreeNode node, boolean left) {
        if (node == null) {
            if (left) {
                return "lnull";
            } else {
                return "rnull";
            }
        }
        return "*" + node.val + " " + preorderTraverse(node.left, true) + " " + preorderTraverse(node.right, false);
    }
}
