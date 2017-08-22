package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/22/17.
 */
public class SearchInRotatedSortedArrayTest {
    @Test
    public void search() throws Exception {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        Assert.assertTrue(searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1) == 5);
    }

}