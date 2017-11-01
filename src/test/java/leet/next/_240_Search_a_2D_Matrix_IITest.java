package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/1/17.
 */
public class _240_Search_a_2D_Matrix_IITest {
    @Test
    public void searchMatrix() throws Exception {
        _240_Search_a_2D_Matrix_II test = new _240_Search_a_2D_Matrix_II();

        Assert.assertEquals(test.searchMatrix(new int[][] {{5}, {6}}, 6), true);

        Assert.assertEquals(test.searchMatrix(new int[][] {{}}, 1), false);

        Assert.assertEquals(test.searchMatrix(new int[][] {
                {1 ,4,  7, 11, 15},
                {2, 5,  8, 12, 19},
                {3, 6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30} 
        }, 1), true);

        Assert.assertEquals(test.searchMatrix(new int[][] {
                {1 ,4,  7, 11, 15},
                {2, 5,  8, 12, 19},
                {3, 6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 5), true);

        Assert.assertEquals(test.searchMatrix(new int[][] {
                {1 ,4,  7, 11, 15},
                {2, 5,  8, 12, 19},
                {3, 6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 20), false);
    }

}