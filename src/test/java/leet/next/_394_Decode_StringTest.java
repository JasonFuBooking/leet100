package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/3/17.
 */
public class _394_Decode_StringTest {
    @Test
    public void decodeString() throws Exception {
        _394_Decode_String test = new _394_Decode_String();
        Assert.assertEquals(test.decodeString("3[a]2[bc]"), "aaabcbc");
        Assert.assertEquals(test.decodeString("3[a2[c]]"), "accaccacc");
        Assert.assertEquals(test.decodeString("2[abc]3[cd]ef"), "abcabccdcdcdef");

    }

}