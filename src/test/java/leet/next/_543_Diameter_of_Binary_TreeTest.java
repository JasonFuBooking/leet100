package leet.next;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/24/17.
 */
public class _543_Diameter_of_Binary_TreeTest {
    @Test
    public void diameterOfBinaryTree() throws Exception {
        _543_Diameter_of_Binary_Tree test = new _543_Diameter_of_Binary_Tree();
        Assert.assertTrue(test.diameterOfBinaryTree(TreeNode.createTree1()) == 4);
        test = new _543_Diameter_of_Binary_Tree();
        Assert.assertTrue(test.diameterOfBinaryTree(new TreeNode(0)) == 0);
    }

}