package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/1/17.
 */
public class _238_Product_of_Array_Except_SelfTest {
    @Test
    public void productExceptSelf() throws Exception {
        _238_Product_of_Array_Except_Self test = new _238_Product_of_Array_Except_Self();
        Assert.assertArrayEquals(test.productExceptSelf(new int[]{1,2,3,4}), new int[]{24,12,8,6});
    }

}