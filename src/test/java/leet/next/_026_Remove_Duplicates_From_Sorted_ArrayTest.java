package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/10/17.
 */
public class _026_Remove_Duplicates_From_Sorted_ArrayTest {
    @Test
    public void removeDuplicates() throws Exception {
        _026_Remove_Duplicates_From_Sorted_Array test = new _026_Remove_Duplicates_From_Sorted_Array();
        Assert.assertEquals(test.removeDuplicates(new int[]{}), 0);
        Assert.assertEquals(test.removeDuplicates(new int[]{1,1,2}), 2);
        Assert.assertEquals(test.removeDuplicates(new int[]{1,1,2,3,3,4}), 4);
        Assert.assertEquals(test.removeDuplicates(new int[]{1,2,3,4,5,6}), 6);
        Assert.assertEquals(test.removeDuplicates(new int[]{}), 0);

    }

}