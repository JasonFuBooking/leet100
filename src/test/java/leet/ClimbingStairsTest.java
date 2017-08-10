package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/10/17.
 */
public class ClimbingStairsTest {
    private ClimbingStairs climbingStairs = new ClimbingStairs();
    @Test
    public void climbStairs() throws Exception {
        Assert.assertEquals(climbingStairs.climbStairs(1), 1);
        Assert.assertEquals(climbingStairs.climbStairs(2), 2);
        Assert.assertEquals(climbingStairs.climbStairs(3), 3);
        Assert.assertEquals(climbingStairs.climbStairs(4), 5);
    }

}