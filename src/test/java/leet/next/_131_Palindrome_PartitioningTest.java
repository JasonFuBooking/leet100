package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/13/17.
 */
public class _131_Palindrome_PartitioningTest {
    @Test
    public void partition() throws Exception {
        _131_Palindrome_Partitioning test = new _131_Palindrome_Partitioning();
        Assert.assertEquals(test.partition("aab").size(), 2);
    }

}