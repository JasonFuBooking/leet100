package leet;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {
    private ReverseInteger reverseInteger = new ReverseInteger();
    @Test
    public void reverse() throws Exception {
        Assert.assertTrue(reverseInteger.reverse(0) == 0) ;
        Assert.assertTrue(reverseInteger.reverse(1) == 1) ;
        Assert.assertTrue(reverseInteger.reverse(-1) == -1) ;
        Assert.assertTrue(reverseInteger.reverse(10) == 1) ;
        Assert.assertTrue(reverseInteger.reverse(-10) == -1) ;

        Assert.assertTrue(reverseInteger.reverse(11) == 11) ;
        Assert.assertTrue(reverseInteger.reverse(-11) == -11) ;
        Assert.assertTrue(reverseInteger.reverse(-12) == -21) ;
        Assert.assertTrue(reverseInteger.reverse(-100) == -1) ;
        Assert.assertTrue(reverseInteger.reverse(-101) == -101) ;

        Assert.assertTrue(reverseInteger.reverse(123) == 321) ;
        Assert.assertTrue(reverseInteger.reverse(-123) == -321) ;
        Assert.assertTrue(reverseInteger.reverse(1534236469) == 0) ;
        Assert.assertTrue(reverseInteger.reverse(-2147483648) == 0) ;
    }

}