package leet.next;

import org.junit.Assert;
import org.junit.Test;

public class _096_UniqueBinarySearchTreesTest {
    @Test
    public void numTrees() throws Exception {
        _096_UniqueBinarySearchTrees test = new _096_UniqueBinarySearchTrees();
        Assert.assertEquals(test.numTrees(1), 1);
        Assert.assertEquals(test.numTrees(3), 5);
        Assert.assertEquals(test.numTrees(4), 14);
    }

}