package leet;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    private MedianOfTwoSortedArrays median = new MedianOfTwoSortedArrays();
    @Test
    public void findMedianSortedArrays() throws Exception {
        Assert.assertTrue(median.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2.0);
        Assert.assertTrue(median.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}) == 2.5);
    }

}