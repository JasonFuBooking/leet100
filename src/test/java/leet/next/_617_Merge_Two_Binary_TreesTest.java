package leet.next;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/24/17.
 */
public class _617_Merge_Two_Binary_TreesTest {
    @Test
    public void mergeTrees() throws Exception {
        _617_Merge_Two_Binary_Trees test = new _617_Merge_Two_Binary_Trees();
        test.mergeTrees(createNodeA(), createNodeB());
            test.mergeTrees(createNodeC(), createNodeD());
    }

    private TreeNode createNodeA() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2left = new TreeNode(3);
        TreeNode node2right = new TreeNode(2);
        TreeNode node3left = new TreeNode(5);
        node1.left = node2left;
        node1.right = node2right;
        node2left.left = node3left;
        return node1;
    }

    private TreeNode createNodeB() {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2left = new TreeNode(1);
        TreeNode node2right = new TreeNode(3);
        TreeNode node3right = new TreeNode(4);
        node1.left = node2left;
        node1.right = node2right;
        node2left.right = node3right;
        node2right.right = new TreeNode(7);
        return node1;
    }

    private TreeNode createNodeC() {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2left = new TreeNode(4);
        TreeNode node2right = new TreeNode(5);
        TreeNode node3left = new TreeNode(1);
        node1.left = node2left;
        node1.right = node2right;
        node2left.left = node3left;
        node2left.right = new TreeNode(2);
        return node1;
    }

    private TreeNode createNodeD() {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2left = new TreeNode(1);
        TreeNode node2right = new TreeNode(2);
        node1.left = node2left;
        node1.right = node2right;
        return node1;
    }

}