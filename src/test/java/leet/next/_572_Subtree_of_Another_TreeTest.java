package leet.next;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/24/17.
 */
public class _572_Subtree_of_Another_TreeTest {
    @Test
    public void isSubtree() throws Exception {
        _572_Subtree_of_Another_Tree test = new _572_Subtree_of_Another_Tree();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        Assert.assertTrue(test.isSubtree(node1, node2));
    }

    @Test
    public void isSubtree2() throws Exception {
        _572_Subtree_of_Another_Tree test = new _572_Subtree_of_Another_Tree();
        TreeNode node1 = new TreeNode(12);
        TreeNode node2 = new TreeNode(2);
        Assert.assertFalse(test.isSubtree(node1, node2));
    }

}