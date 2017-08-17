package leet;

import org.junit.Assert;
import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/17/17.
 */
public class MergeTwoSortedListsTest {
    @Test
    public void mergeTwoLists() throws Exception {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(
                ListNode.createListFrom(new int[]{1, 2, 3}),
                ListNode.createListFrom(new int[]{4, 5, 6})),
                ListNode.createListFrom(new int[]{1, 2, 3, 4, 5, 6}));

        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(
                ListNode.createListFrom(new int[]{1, 3, 5}),
                ListNode.createListFrom(new int[]{2, 4, 6})),
                ListNode.createListFrom(new int[]{1, 2, 3, 4, 5, 6}));

        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(
                ListNode.createListFrom(new int[]{}),
                ListNode.createListFrom(new int[]{})),
                ListNode.createListFrom(new int[]{}));

        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(
                ListNode.createListFrom(new int[]{1}),
                ListNode.createListFrom(new int[]{})),
                ListNode.createListFrom(new int[]{1}));

        Assert.assertEquals(mergeTwoSortedLists.mergeTwoLists(
                ListNode.createListFrom(new int[]{2}),
                ListNode.createListFrom(new int[]{1})),
                ListNode.createListFrom(new int[]{1, 2}));
    }

}