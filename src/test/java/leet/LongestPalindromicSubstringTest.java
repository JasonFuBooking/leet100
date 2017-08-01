package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring longest = new LongestPalindromicSubstring();
    @Test
    public void longestPalindrome(){
        Assert.assertTrue(longest.longestPalindrome("babad").equals("aba"));
        Assert.assertTrue(longest.longestPalindrome("abc").equals("c"));
        Assert.assertTrue(longest.longestPalindrome("cbbd").equals("bb"));
        Assert.assertTrue(longest.longestPalindrome("bbd").equals("bb"));
        Assert.assertTrue(longest.longestPalindrome("abb").equals("bb"));
        Assert.assertTrue(longest.longestPalindrome("b").equals("b"));
        Assert.assertTrue(longest.longestPalindrome("bb").equals("bb"));
        Assert.assertTrue(longest.longestPalindrome("bbb").equals("bbb"));
        Assert.assertTrue(longest.longestPalindrome("bbbb").equals("bbbb"));
    }

}