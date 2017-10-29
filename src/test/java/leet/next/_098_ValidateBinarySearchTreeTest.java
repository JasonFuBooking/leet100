package leet.next;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

public class _098_ValidateBinarySearchTreeTest {
    @Test
    public void isValidBST() throws Exception {
        _098_ValidateBinarySearchTree test = new _098_ValidateBinarySearchTree();
        Assert.assertFalse(test.isValidBST(TreeNode.createTree2()));
    }

}