package leet.next;

import util.TreeNode;

import java.util.HashMap;

/**

 The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

 Determine the maximum amount of money the thief can rob tonight without alerting the police.

 Example 1:
      3
     / \
    2   3
     \   \
     3   1
 Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 Example 2:
     3
    / \
   4   5
  / \   \
 1   3   1
 Maximum amount of money the thief can rob = 4 + 5 = 9.
 */

/*
我们以例1为例子，
对于根节点3来说，要么就是3+3+1 要么就是2+3. 不可能再有其他情况，否则就相连了

其实抽象起来，对于一个节点node来说
我们要么就是node.value 加上他隔代之后的最大value
要么就是他的两个子孙节点。
所以用递归就可以遍历出所有情况，取最大值

这里关键的是47行，因为从顶向下递归会有很多重复计算，使用map可以提高效率，剪枝
 */
public class _337_House_Robber_III {
    public int rob(TreeNode root) {
        return calculate(root, new HashMap<TreeNode, Integer>());
    }

    private int calculate(TreeNode node, HashMap<TreeNode, Integer> map) {
        if (node == null) return 0;
        if (map.containsKey(node)) return map.get(node);

        int value = 0;
        if (node.left != null) {
            value += calculate(node.left.left, map) + calculate(node.left.right, map);
        }
        if (node.right != null) {
            value += calculate(node.right.left, map) + calculate(node.right.right, map);
        }
        value = Math.max(value + node.val, calculate(node.left, map) + calculate(node.right, map));
        map.put(node, value);
        return value;
    }
}
