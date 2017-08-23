package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/23/17.
 */
public class SortColorsTest {
    @Test
    public void sortColors() throws Exception {
        SortColors sortColors = new SortColors();
        int[] a = new int[]{};
        sortColors.sortColors(a);
        Assert.assertArrayEquals(a, new int[]{});
    }

    @Test
    public void sortColors1() throws Exception {
        SortColors sortColors = new SortColors();
        int[] a = new int[]{2, 1, 0};
        sortColors.sortColors(a);
        Assert.assertArrayEquals(a, new int[]{0, 1, 2});
    }

    @Test
    public void sortColors2() throws Exception {
        SortColors sortColors = new SortColors();
        int[] a = new int[]{1, 0};
        sortColors.sortColors(a);
        Assert.assertArrayEquals(a, new int[]{0, 1});
    }

    @Test
    public void sortColors3() throws Exception {
        SortColors sortColors = new SortColors();
        int[] a = new int[]{1};
        sortColors.sortColors(a);
        Assert.assertArrayEquals(a, new int[]{1});
    }

}