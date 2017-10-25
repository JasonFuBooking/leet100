package leet.next;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 You are given a binary tree in which each originNode contains an integer value.

 Find the number of paths that sum to a given value.

 The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

 The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

 Example:

 root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

       10
      /  \
     5   -3
    / \    \
   3   2   11
  / \   \
 3  -2   1

 Return 3. The paths that sum to 8 are:

 1.  5 -> 3
 2.  5 -> 2 -> 1
 3. -3 -> 11
 */

/*

思路其实很简单，就是实现起来麻烦了点。
一句话：通过改装后的按层次遍历，来逐个计算每个节点和父节点的所有距离

1. 用Node来包装原来的节点，为每个节点增加一个list，保存当前值+当前值加上上一级节点所有的values. 实际就是记录了当前节点到他的所有父节点的距离。
按层次遍历的话，子节点的计算可以基于父节点的values，避免了重复计算
2. 通过按层次遍历，来一次计算每个节点的values
3. 在计算的过程中如果有value的值正好等于sum, count数就加一

 */
public class _437_Path_Sum_III {
    class Count {
        int value;
        void increase() {
            ++value;
        }
    }
    class Node {
        TreeNode originNode;
        List<Integer> values = new LinkedList<>();

        Node(TreeNode node, Count count, int sum) {
            this.originNode = node;
            values.add(node.val);
            if (node.val == sum) count.increase();
        }

        TreeNode getLeft() {
            return originNode.left;
        }

        void addParentValues(Node parent, Count count, int sum) {
            for (Integer value : parent.values) {
                int newValue = value + originNode.val;
                if (newValue == sum) count.increase();
                values.add(newValue);
            }
        }

        @Override
        public String toString() {
            return "Node{" +
                    "originNode=" + originNode.val +
                    ", values=" + values +
                    '}';
        }
    }
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;

        Count count = new Count();
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(root, count, sum));

        while (!queue.isEmpty()) {
            List<Node> thisLevel = new LinkedList<>();
            while (!queue.isEmpty()) {
                thisLevel.add(queue.poll());
            }

            List<Node> nextLevel = new LinkedList<>();
            for (Node node : thisLevel) {
                if (node.originNode.left != null) {
                    Node left = new Node(node.originNode.left, count, sum);
                    left.addParentValues(node, count, sum);
                    nextLevel.add(left);
                }

                if (node.originNode.right != null) {
                    Node right = new Node(node.originNode.right, count, sum);
                    right.addParentValues(node, count, sum);
                    nextLevel.add(right);
                }
            }
            queue.addAll(nextLevel);
        }

        return count.value;
    }
}