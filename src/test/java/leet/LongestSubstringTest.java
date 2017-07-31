package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {
    private LongestSubstring longestSubstring = new LongestSubstring();
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("abcabcbb"), 3);
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("bbbbb"), 1);
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("bb"), 1);
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("b"), 1);
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("pwwkew"), 3);
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("abcdefg"), 7);
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("ab"), 2);
        Assert.assertEquals(longestSubstring.lengthOfLongestSubstring("abd"), 3);
    }

}