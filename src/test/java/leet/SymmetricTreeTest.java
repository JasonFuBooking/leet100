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
        Assert.assertTrue(symmetricTree.isSymmetric(TreeNode.createTree1()));
        Assert.assertTrue(!symmetricTree.isSymmetric(TreeNode.createTree2()));
    }



}