package leet;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void isValid() throws Exception {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid(""));
        Assert.assertTrue(validParentheses.isValid("{}"));
        Assert.assertTrue(!validParentheses.isValid("["));
        Assert.assertTrue(validParentheses.isValid("[](){}"));
        Assert.assertTrue(!validParentheses.isValid("([)]"));
        Assert.assertTrue(!validParentheses.isValid("(]"));
    }

}