package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/2/17.
 */
public class _494_Target_SumTest {
    @Test
    public void findTargetSumWays() throws Exception {
        _494_Target_Sum test = new _494_Target_Sum();
        Assert.assertEquals(test.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3), 5);
    }

}