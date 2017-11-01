package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/1/17.
 */
public class _215_Kth_Largest_Element_in_an_ArrayTest {
    @Test
    public void findKthLargest() throws Exception {
        _215_Kth_Largest_Element_in_an_Array test = new _215_Kth_Largest_Element_in_an_Array();
        Assert.assertEquals(test.findKthLargest(new int[]{3,2,1,5,6,4}, 2), 5);
    }

}