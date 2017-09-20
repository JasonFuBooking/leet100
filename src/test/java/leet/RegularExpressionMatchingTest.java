package leet;

import leet.unresolve.RegularExpressionMatching;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jafu on 9/20/17.
 */
public class RegularExpressionMatchingTest {
    @Test
    public void isMatch() throws Exception {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        Assert.assertTrue(!regularExpressionMatching.isMatch("aa", "a"));
        Assert.assertTrue(regularExpressionMatching.isMatch("aa", "aa"));
        Assert.assertTrue(!regularExpressionMatching.isMatch("aaa", "aa"));
        Assert.assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
        Assert.assertTrue(regularExpressionMatching.isMatch("aa", ".*"));
        Assert.assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
        Assert.assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
        Assert.assertTrue(!regularExpressionMatching.isMatch("ab", ".*c"));
    }

}