package leet.next;

import util.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

 Return a deep copy of the list.
 */

/*
这道题挺有意思的。
我觉得这位网友的解法非常好，虽然性能不是最好的。
但是非常清晰易懂。
借助了hashmap
 */
public class _138_Copy_List_with_Random_Pointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode node = head;
        while (node != null) {
            map.put(node, new RandomListNode(node.label));
            node = node.next;
        }

        node = head;
        while (node != null) {
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
