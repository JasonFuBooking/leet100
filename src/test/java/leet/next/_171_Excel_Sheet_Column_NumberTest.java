package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/13/17.
 */
public class _171_Excel_Sheet_Column_NumberTest {
    @Test
    public void titleToNumber() throws Exception {
        _171_Excel_Sheet_Column_Number test = new _171_Excel_Sheet_Column_Number();
        Assert.assertEquals(test.titleToNumber("A"), 1);
        Assert.assertEquals(test.titleToNumber("B"), 2);
        Assert.assertEquals(test.titleToNumber("AA"), 27);
        Assert.assertEquals(test.titleToNumber("AB"), 28);
        Assert.assertEquals(test.titleToNumber("AAB"), 704);

    }

}