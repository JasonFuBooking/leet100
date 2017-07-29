package leet;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    private TwoSum twoSum = new TwoSum();
    @Test
    public void twoSum() {
        int[] a = new int[]{2, 7, 11, 15};
        int target = 9;
        Assert.assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(a, target));
    }

    @Test
    public void twoSum2() {
        int[] a = new int[]{2, 7, 11, 15};
        int target = 10;
        Assert.assertArrayEquals(null, twoSum.twoSum(a, target));
    }

    @Test
    public void twoSum3() {
        int[] a = new int[]{};
        int target = 10;
        Assert.assertArrayEquals(null, twoSum.twoSum(a, target));
    }

    @Test
    public void twoSum4() {
        int[] a = new int[]{1, 2};
        int target = 10;
        Assert.assertArrayEquals(null, twoSum.twoSum(a, target));
    }


}