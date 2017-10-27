package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/27/17.
 */
public class _031_NextPermutationTest {
    @Test
    public void nextPermutation() throws Exception {
        _031_NextPermutation test = new _031_NextPermutation();
        int[] array = new int[]{};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{});

        array = new int[]{1};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{1});

        array = new int[]{1, 2};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{2, 1});

        array = new int[]{2, 1};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{1, 2});

        array = new int[]{3, 2, 1};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{1, 2, 3});

        array = new int[]{1, 2, 3};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{1, 3, 2});

        array = new int[]{1, 1, 5};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{1, 5, 1});

        array = new int[]{1, 5, 1};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{5, 1, 1});

        array = new int[]{4,2,4,4,3};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{4,3,2,4,4});

        array = new int[]{2,3,6,5,4,1};
        test.nextPermutation(array);
        Assert.assertArrayEquals(array, new int[]{2,4,1,3,5,6});


    }

}