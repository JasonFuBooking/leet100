package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/17/17.
 */
public class MaximumSubarrayTest {
    @Test
    public void maxSubArray() throws Exception {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        Assert.assertEquals(maximumSubarray.maxSubArray(null), 0);
        Assert.assertEquals(maximumSubarray.maxSubArray(new int[] {}), 0);
        Assert.assertEquals(maximumSubarray.maxSubArray(new int[] {3}), 3);
        Assert.assertEquals(maximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}), 6);
    }

}