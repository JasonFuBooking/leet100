package util;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode createListFrom(int[] array) {
        List<ListNode> list = new ArrayList<>();
        for (int i : array) {
            list.add(new ListNode(i));
        }
        for (int i = 0; i < list.size() - 1; ++i) {
            list.get(i).next = list.get(i + 1);
        }
        return list.get(0);
    }

    @Override
    public boolean equals(Object y) {
        if (y == this) return true;
        if (y == null) return false;
        if (y.getClass() != this.getClass())
            return false;

        ListNode that = (ListNode) y;
        if (((ListNode) y).val != this.val) return false;

        ListNode list1 = next;
        ListNode list2 = ((ListNode) y).next;
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) return false;
            list1 = list1.next;
            list2 = list2.next;
        }
        if (list2 != null || list1 != null) return false;
        return true;
    }
}
