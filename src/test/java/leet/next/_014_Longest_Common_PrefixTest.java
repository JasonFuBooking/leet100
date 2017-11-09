package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/9/17.
 */
public class _014_Longest_Common_PrefixTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        _014_Longest_Common_Prefix test = new _014_Longest_Common_Prefix();
        Assert.assertEquals(test.longestCommonPrefix(null), "");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{}), "");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"a"}), "a");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"aa"}), "aa");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"a", "ab"}), "a");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"a", "a"}), "a");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"a", "b"}), "");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"a", "bb"}), "");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"aa", "bb"}), "");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"aa", "aa"}), "aa");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"aac", "aad"}), "aa");
        Assert.assertEquals(test.longestCommonPrefix(new String[]{"le", "leet", "leetcode"}), "le");
    }

}