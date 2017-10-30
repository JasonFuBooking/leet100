package leet.next;

import util.ListNode;

/**
 Sort a linked list in O(n log n) time using constant space complexity.
 */

/*
这道题还挺有意思。
首先回忆一下nlogn的基础算法有哪些呢？归并，堆，可能还可以算上快排吧。
堆是不可能了，空间复杂度不能缩减。
原始的快拍依赖于数组下标，看起来还蛮麻烦的。

归并虽然依赖辅助数组，但是其作用只是存储排好序的那一部分节点，这里利用链表的性质，可以把这一部分直接替换成修改指针。
这样空间复杂度就做到了常数级。这就是核心的思路。

有了解法接下来我写一下我在实现过程中犯的错误。
1. 30行，注意递归函数的退出条件不能少
2. 35行，注意和普通的递归不同，普通的递归是依靠数组下标区分两组序列，这里我们要手动断开两个序列，要不不好归并
3. 49行，注意保存头结点。

其他的部分其实都和归并排序一模一样。

 */
public class _148_SortList {
    public ListNode sortList(ListNode head) {
        return sort(head);
    }

    private ListNode sort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;

        ListNode left = sort(head);
        ListNode right = sort(slow);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        while (left != null && right != null) {
            if (left.val < right.val) {
                node.next = left;
                left = left.next;
            } else {
                node.next = right;
                right = right.next;
            }
            node = node.next;
        }
        if (left != null) {
            node.next = left;
        }
        if (right != null) {
            node.next = right;
        }
        return head.next;
    }
}
