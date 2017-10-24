package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/24/17.
 */
public class _581_Shortest_Unsorted_Continuous_SubarrayTest {
    @Test
    public void findUnsortedSubarray() throws Exception {
        _581_Shortest_Unsorted_Continuous_Subarray test = new _581_Shortest_Unsorted_Continuous_Subarray();
        Assert.assertTrue(test.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}) == 5);
        Assert.assertTrue(test.findUnsortedSubarray(new int[]{1,3,2,2,2}) == 4);
    }

}