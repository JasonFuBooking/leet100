package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/10/17.
 */
public class SearchInsertPositionTest {
    private SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
    @Test
    public void searchInsert() throws Exception {
        Assert.assertEquals(searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5), 2);
        Assert.assertEquals(searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2), 1);
        Assert.assertEquals(searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7), 4);
        Assert.assertEquals(searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 0), 0);
        Assert.assertEquals(searchInsertPosition.searchInsert(new int[]{1,3}, 3), 1);
        int[] array = new int[10000];
        int start = -5000;
        for (int i = 0; i < array.length; ++i) {
            array[i] = (start++);
        }
        Assert.assertEquals(searchInsertPosition.searchInsert(array, 1309), 6309);
    }

}