package leet;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */

/*
算了，我还是写个容易理解的版本吧
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        List<ListNode> result = new ArrayList<>();
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                result.add(l1);
                l1 = l1.next;
            } else {
                result.add(l2);
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            result.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            result.add(l2);
            l2 = l2.next;
        }
        for (int i = 0; i < result.size() - 1; ++i) {
            result.get(i).next = result.get(i + 1);
        }
        result.get(result.size() - 1).next = null;

        return result.get(0);
    }
}
