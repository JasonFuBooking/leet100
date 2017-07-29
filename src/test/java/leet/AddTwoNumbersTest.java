package leet;

import org.junit.Assert;
import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    @Test
    public void addTwoNumbers() throws Exception {
        ListNode result = addTwoNumbers.addTwoNumbers(
                ListNode.createListFrom(new int[]{2, 4, 3}),
                ListNode.createListFrom(new int[]{5, 6, 4}));
        Assert.assertTrue(result.equals(ListNode.createListFrom(new int[]{7, 0, 8})));
    }

    @Test
    public void addTwoNumbers2() throws Exception {
        ListNode result = addTwoNumbers.addTwoNumbers(
                ListNode.createListFrom(new int[]{1, 7, 1}),
                ListNode.createListFrom(new int[]{9}));
        Assert.assertTrue(result.equals(ListNode.createListFrom(new int[]{0, 8, 1})));
    }

    @Test
    public void addTwoNumbers3() throws Exception {
        ListNode result = addTwoNumbers.addTwoNumbers(
                ListNode.createListFrom(new int[]{1}),
                ListNode.createListFrom(new int[]{9}));
        Assert.assertTrue(result.equals(ListNode.createListFrom(new int[]{0, 1})));
    }

}