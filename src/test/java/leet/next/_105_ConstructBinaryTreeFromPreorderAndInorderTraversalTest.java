package leet.next;

import org.junit.Test;

import static org.junit.Assert.*;

public class _105_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    @Test
    public void buildTree() throws Exception {
        _105_ConstructBinaryTreeFromPreorderAndInorderTraversal test = new _105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
        test.buildTree(new int[]{3,1,0,2,5,4,6}, new int[]{0,1,2,3,4,5,6});
    }

}