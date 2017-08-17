package leet;

import org.junit.Assert;
import org.junit.Test;
import util.ListNode;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jafu on 8/17/17.
 */
public class LinkedListCycleTest {
    @Test
    public void hasCycle() throws Exception {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Assert.assertTrue(!linkedListCycle.hasCycle(ListNode.createListFrom(new int[]{1,2,3})));

        ListNode node = ListNode.createListFrom(new int[]{3, 4, 5, 6, 7});
        ListNode.get(node, 4).next = ListNode.get(node, 2);
        Assert.assertTrue(linkedListCycle.hasCycle(node));

    }

}