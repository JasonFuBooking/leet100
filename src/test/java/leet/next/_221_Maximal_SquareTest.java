package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/1/17.
 */
public class _221_Maximal_SquareTest {
    @Test
    public void maximalSquare() throws Exception {
        _221_Maximal_Square test = new _221_Maximal_Square();

        Assert.assertEquals(test.maximalSquare(new char[][] {
                {'0','0','0','1','0','1','1','1'},
                {'0','1','1','0','0','1','0','1'},
                {'1','0','1','1','1','1','0','1'},
                {'0','0','0','1','0','0','0','0'},
                {'0','0','1','0','0','0','1','0'},
                {'1','1','1','0','0','1','1','1'},
                {'1','0','0','1','1','0','0','1'},
                {'0','1','0','0','1','1','0','0'},
                {'1','0','0','1','0','0','0','0'}
        }), 1);

        Assert.assertEquals(test.maximalSquare(new char[][] {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        }), 4);


    }

}