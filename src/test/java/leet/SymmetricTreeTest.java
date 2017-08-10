package leet;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/10/17.
 */
public class SymmetricTreeTest {
    private SymmetricTree symmetricTree = new SymmetricTree();
    @Test
    public void isSymmetric() throws Exception {
        Assert.assertTrue(symmetricTree.isSymmetric(createTree1()));
        Assert.assertTrue(!symmetricTree.isSymmetric(createTree2()));
    }

    private TreeNode createTree1() {
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

    private TreeNode createTree2() {
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

}