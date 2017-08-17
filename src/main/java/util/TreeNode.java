package util;

/**
 * Created by jafu on 8/10/17.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static TreeNode createTree1() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2left = new TreeNode(2);
        TreeNode node2right = new TreeNode(2);
        TreeNode node3left = new TreeNode(3);
        TreeNode node3right = new TreeNode(3);
        TreeNode node4left = new TreeNode(4);
        TreeNode node4right = new TreeNode(4);
        node1.left = node2left;
        node1.right = node2right;
        node2left.left = node3left;
        node2left.right = node4left;
        node2right.left = node4right;
        node2right.right = node3right;
        return node1;
    }

    public static TreeNode createTree2() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2left = new TreeNode(2);
        TreeNode node2right = new TreeNode(2);
        TreeNode node3left = new TreeNode(3);
        TreeNode node3right = new TreeNode(3);

        node1.left = node2left;
        node1.right = node2right;
        node2left.right = node3left;
        node2right.right = node3right;
        return node1;
    }

    public static TreeNode createTree3() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node1right = new TreeNode(2);
        TreeNode node2right = new TreeNode(3);

        node1.right = node1right;
        node1right.right = node2right;
        return node1;
    }
}
