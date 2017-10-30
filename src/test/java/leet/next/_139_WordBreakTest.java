package leet.next;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jafu on 10/30/17.
 */
public class _139_WordBreakTest {
    @Test
    public void wordBreak() throws Exception {
        _139_WordBreak test = new _139_WordBreak();
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        Assert.assertTrue(test.wordBreak("leetcode", list));

        list = new ArrayList<>();
        list.add("aaaa");
        list.add("aaa");
        Assert.assertTrue(test.wordBreak("aaaaaaa", list));
    }

}