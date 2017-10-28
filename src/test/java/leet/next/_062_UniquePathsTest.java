package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _062_UniquePathsTest {
    @Test
    public void uniquePaths() throws Exception {
        _062_UniquePaths test = new _062_UniquePaths();
        Assert.assertEquals(test.uniquePaths(3, 3), 6);
    }

}