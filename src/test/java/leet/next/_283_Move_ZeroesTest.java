package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/26/17.
 */
public class _283_Move_ZeroesTest {
    @Test
    public void moveZeroes() throws Exception {
        _283_Move_Zeroes test = new _283_Move_Zeroes();
        int[] a = new int[]{0, 1, 0, 3, 12};
        test.moveZeroes(a);
        Assert.assertArrayEquals(a, new int[]{1, 3, 12, 0, 0});

        int[] b = new int[]{0, 1, 0, 3, 0};
        test.moveZeroes(b);
        Assert.assertArrayEquals(b, new int[]{1, 3, 0, 0, 0});
    }

}