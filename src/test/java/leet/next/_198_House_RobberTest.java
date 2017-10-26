package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/26/17.
 */
public class _198_House_RobberTest {
    @Test
    public void rob() throws Exception {
        _198_House_Robber test = new _198_House_Robber();
        Assert.assertEquals(test.rob(new int[]{1, 2, 88, 0}), 89);
    }

}