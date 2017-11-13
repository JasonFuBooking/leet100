package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/13/17.
 */
public class _162_Find_Peak_ElementTest {
    @Test
    public void findPeakElement() throws Exception {
        _162_Find_Peak_Element test = new _162_Find_Peak_Element();
        Assert.assertEquals(test.findPeakElement(new int[]{1}), 0);
        Assert.assertEquals(test.findPeakElement(new int[]{1, 2}), 1);
        Assert.assertEquals(test.findPeakElement(new int[]{1, 2, 3, 1}), 2);
    }

}