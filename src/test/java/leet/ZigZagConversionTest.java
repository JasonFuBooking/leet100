package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {
    private ZigZagConversion zigZagConversion = new ZigZagConversion();
    @Test
    public void convert() throws Exception {
        Assert.assertTrue(zigZagConversion.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
        Assert.assertTrue(zigZagConversion.convert("a", 3).equals("a"));
        Assert.assertTrue(zigZagConversion.convert("aa", 3).equals("aa"));
        Assert.assertTrue(zigZagConversion.convert("aaa", 3).equals("aaa"));
        Assert.assertTrue(zigZagConversion.convert("ab", 3).equals("ab"));
        Assert.assertTrue(zigZagConversion.convert("abc", 3).equals("abc"));
        Assert.assertTrue(zigZagConversion.convert("abcd", 3).equals("abdc"));

        Assert.assertTrue(zigZagConversion.convert("a", 1).equals("a"));
        Assert.assertTrue(zigZagConversion.convert("aa", 1).equals("aa"));
        Assert.assertTrue(zigZagConversion.convert("aaa", 1).equals("aaa"));
        Assert.assertTrue(zigZagConversion.convert("ab", 1).equals("ab"));
        Assert.assertTrue(zigZagConversion.convert("abc", 1).equals("abc"));
        Assert.assertTrue(zigZagConversion.convert("abcd", 1).equals("abcd"));

        Assert.assertTrue(zigZagConversion.convert("a", 2).equals("a"));
        Assert.assertTrue(zigZagConversion.convert("aa", 2).equals("aa"));
        Assert.assertTrue(zigZagConversion.convert("aaa", 2).equals("aaa"));
        Assert.assertTrue(zigZagConversion.convert("ab", 2).equals("ab"));
        Assert.assertTrue(zigZagConversion.convert("abc", 2).equals("acb"));
        Assert.assertTrue(zigZagConversion.convert("abcd", 2).equals("acbd"));
    }

}