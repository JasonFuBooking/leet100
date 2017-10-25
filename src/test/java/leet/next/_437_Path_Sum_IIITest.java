package leet.next;

import org.junit.Assert;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/25/17.
 */
public class _437_Path_Sum_IIITest {
    @Test
    public void pathSum() throws Exception {
        TreeNode node1 = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node_3 = new TreeNode(-3);

        node1.left = node5;
        node1.right = node_3;

        node_3.left = new TreeNode(11);

        node5.left = new TreeNode(3);
        node5.right = new TreeNode(2);

        node5.left.left = new TreeNode(3);
        node5.left.right = new TreeNode(-2);

        node5.right.right = new TreeNode(1);

        _437_Path_Sum_III test = new _437_Path_Sum_III();
        Assert.assertEquals(test.pathSum(node1, 8), 3);
    }


}