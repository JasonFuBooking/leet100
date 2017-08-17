package leet;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/17/17.
 */
public class BalancedBinaryTreeTest {
    @Test
    public void isBalanced() throws Exception {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        Assert.assertEquals(balancedBinaryTree.isBalanced(TreeNode.createTree1()), true);
        Assert.assertEquals(balancedBinaryTree.isBalanced(TreeNode.createTree2()), true);
        Assert.assertEquals(balancedBinaryTree.isBalanced(TreeNode.createTree3()), false);
    }
}