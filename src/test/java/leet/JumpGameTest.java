package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/29/17.
 */
public class JumpGameTest {
    @Test
    public void canJump() throws Exception {
        JumpGame jumpGame = new JumpGame();
        Assert.assertTrue(jumpGame.canJump(new int[]{2,3,1,1,4}));
        Assert.assertTrue(!jumpGame.canJump(new int[]{3,2,1,0,4}));
        Assert.assertTrue(jumpGame.canJump(new int[]{}));
        Assert.assertTrue(jumpGame.canJump(new int[]{0}));
        Assert.assertTrue(jumpGame.canJump(new int[]{2, 0}));
    }

}