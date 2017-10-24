package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/24/17.
 */
public class _463_Island_PerimeterTest {
    @Test
    public void islandPerimeter() throws Exception {
        int[][] grid = new int[4][];
        grid[0] = new int[]{0,1,0,0};
        grid[1] = new int[]{1,1,1,0};
        grid[2] = new int[]{0,1,0,0};
        grid[3] = new int[]{1,1,0,0};
        _463_Island_Perimeter test = new _463_Island_Perimeter();
        Assert.assertTrue(test.islandPerimeter(grid) == 16);
    }

}