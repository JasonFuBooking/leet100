package leet;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/17/17.
 */
public class MaximumDepthOfBinaryTreeTest {
    @Test
    public void maxDepth() throws Exception {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        Assert.assertEquals(maximumDepthOfBinaryTree.maxDepth(null), 0);
        Assert.assertEquals(maximumDepthOfBinaryTree.maxDepth(TreeNode.createTree1()), 3);
        Assert.assertEquals(maximumDepthOfBinaryTree.maxDepth(new TreeNode(1)), 1);
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(3);
        Assert.assertEquals(maximumDepthOfBinaryTree.maxDepth(node), 2);
    }

}