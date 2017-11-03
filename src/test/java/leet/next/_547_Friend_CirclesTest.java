package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/3/17.
 */
public class _547_Friend_CirclesTest {
    @Test
    public void findCircleNum() throws Exception {
        _547_Friend_Circles test = new _547_Friend_Circles();
        Assert.assertEquals(test.findCircleNum(new int[][]{
                {1,1,0},
                {1,1,0},
                {0,0,1}
        }), 2);

        Assert.assertEquals(test.findCircleNum(new int[][]{
                {1,1,0},
                {1,1,1},
                {0,1,1}
        }), 1);

    }

}