package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/31/17.
 */
public class _200_Number_of_IslandsTest {
    @Test
    public void numIslands() throws Exception {
        _200_Number_of_Islands test = new _200_Number_of_Islands();
        Assert.assertEquals(test.numIslands(new char[][]{
                {'1','0','1','1','1'},
                {'1','0','1','0','1'},
                {'1','1','1','0','1'}
        }), 1);

        Assert.assertEquals(test.numIslands(new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        }), 1);

        Assert.assertEquals(test.numIslands(new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        }), 3);

        Assert.assertEquals(test.numIslands(new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'}
        }), 1);
    }

}