package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/1/17.
 */
public class _287_Find_the_Duplicate_NumberTest {
    @Test
    public void findDuplicate() throws Exception {
        _287_Find_the_Duplicate_Number test = new _287_Find_the_Duplicate_Number();
        Assert.assertEquals(test.findDuplicate(new int[]{3, 1, 2, 1, 4}), 1);
    }

}