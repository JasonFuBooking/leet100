package leet.next;

import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.*;

public class _102_BinaryTreeLevelOrderTraversalTest {
    @Test
    public void levelOrder() throws Exception {
        _102_BinaryTreeLevelOrderTraversal test = new _102_BinaryTreeLevelOrderTraversal();
        test.levelOrder(TreeNode.createTree1());
    }

}