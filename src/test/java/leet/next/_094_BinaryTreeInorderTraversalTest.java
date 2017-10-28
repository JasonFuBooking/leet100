package leet.next;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

public class _094_BinaryTreeInorderTraversalTest {
    @Test
    public void inorderTraversal() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node1right = new TreeNode(2);
        TreeNode node2right = new TreeNode(3);

        node1.right = node1right;
        node1right.left = node2right;
        _094_BinaryTreeInorderTraversal test = new _094_BinaryTreeInorderTraversal();
        test.inorderTraversal(node1);
    }

}