package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/25/17.
 */
public class _438_Find_All_Anagrams_in_a_StringTest {
    @Test
    public void findAnagrams() throws Exception {
        _438_Find_All_Anagrams_in_a_String test = new _438_Find_All_Anagrams_in_a_String();
        Assert.assertEquals(test.findAnagrams("cbaebabacd", "abc").size(), 2);
        Assert.assertEquals(test.findAnagrams("abab", "ab").size(), 3);
    }

}