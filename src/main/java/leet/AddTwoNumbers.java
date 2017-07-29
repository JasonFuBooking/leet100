package leet;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    /*
        首先把链表存入数组，
        然后两个数组按照下标，递增相加，和保存在新的数组里，同时要注意进位
        最后再把结果数组转换回链表就可以了
        时间复杂度应该是O(N)
        空间复杂度也是O(N)
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = createListFrom(l1);
        List<Integer> list2 = createListFrom(l2);
        int index1 = 0;
        int index2 = 0;
        int extra = 0;
        List<ListNode> result = new ArrayList<>();
        while (index1 < list1.size() || index2 < list2.size()) {
            int sum = extra;
            sum += (index1 < list1.size() ? list1.get(index1) : 0);
            sum += (index2 < list2.size() ? list2.get(index2) : 0);
            if (sum > 9) {
                sum = sum - 10;
                extra = 1;
            } else {
                extra = 0;
            }
            result.add(new ListNode(sum));
            ++index1;
            ++index2;
        }
        if (extra > 0) {
            result.add(new ListNode(extra));
        }

        for (int i = 0; i < result.size() - 1; ++i) {
            result.get(i).next = result.get(i + 1);
        }
        return result.size() == 0 ? null : result.get(0);
    }

    private List<Integer> createListFrom(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}
