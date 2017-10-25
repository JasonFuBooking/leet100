package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _015_3SumTest {
    @Test
    public void threeSum() throws Exception {
        _015_3Sum test = new _015_3Sum();
        Assert.assertEquals(test.threeSum(new int[]{-1, 0, 1, 2, -1, -4}).size(), 2);
    }

}