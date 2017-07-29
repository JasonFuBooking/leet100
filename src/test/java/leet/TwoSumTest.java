package leet;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] a = new int[]{2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(a, target));
    }

}