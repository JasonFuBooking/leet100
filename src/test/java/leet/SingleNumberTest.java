package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/10/17.
 */
public class SingleNumberTest {
    private SingleNumber singleNumber = new SingleNumber();
    @Test
    public void singleNumber() throws Exception {
        Assert.assertEquals(singleNumber.singleNumber(new int[]{1, 2, 3, 4, 4, 3, 2}), 1);
        Assert.assertEquals(singleNumber.singleNumber(new int[]{1, 2, 2}), 1);
        Assert.assertEquals(singleNumber.singleNumber(new int[]{1}), 1);
    }

}