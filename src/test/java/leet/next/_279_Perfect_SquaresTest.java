package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/1/17.
 */
public class _279_Perfect_SquaresTest {
    @Test
    public void numSquares() throws Exception {
        _279_Perfect_Squares test = new _279_Perfect_Squares();
        Assert.assertEquals(test.numSquares(7168), 1);
        Assert.assertEquals(test.numSquares(144), 1);
        Assert.assertEquals(test.numSquares(1), 1);
        Assert.assertEquals(test.numSquares(12), 3);

    }

}