package leet.next;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jafu on 11/13/17.
 */
public class _168_Excel_Sheet_Column_TitleTest {
    @Test
    public void convertToTitle() throws Exception {
        _168_Excel_Sheet_Column_Title test = new _168_Excel_Sheet_Column_Title();
        Assert.assertEquals(test.convertToTitle(28), "AB");
        Assert.assertEquals(test.convertToTitle(26), "Z");
    }

}