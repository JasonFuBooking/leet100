package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class _152_MaximumProductSubarrayTest {
    @Test
    public void maxProduct() throws Exception {
        _152_MaximumProductSubarray test = new _152_MaximumProductSubarray();
        Assert.assertEquals(test.maxProduct(new int[] {2, 3, -2, 4}), 6);
        Assert.assertEquals(test.maxProduct(new int[] {-1, -1}), 1);
        Assert.assertEquals(test.maxProduct(new int[] {-2, 3, -4}), 24);
        Assert.assertEquals(test.maxProduct(new int[] {2, 3, 0, 4}), 6);
    }

}