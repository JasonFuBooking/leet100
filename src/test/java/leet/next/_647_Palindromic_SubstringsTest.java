package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/2/17.
 */
public class _647_Palindromic_SubstringsTest {
    @Test
    public void countSubstrings() throws Exception {
        _647_Palindromic_Substrings test = new _647_Palindromic_Substrings();
        Assert.assertEquals(test.countSubstrings("abc"), 3);
        Assert.assertEquals(test.countSubstrings("aaa"), 6);
        Assert.assertEquals(test.countSubstrings("abba"), 6);
    }

}