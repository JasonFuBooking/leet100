package leet;

/**
 * Created by jafu on 8/11/17.
 */
/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 */

/*
这道题的点在于，因为是后进先出，栈内元素的相对位置是固定的
相对位置固定！！！！所以每次进栈保存当前的最小元素即可。
这样就做到了常数级
 */
public class MinStack {
    private Node head;
    public MinStack() {

    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null, null);
        } else {
            Node newNode = new Node(Math.min(x, head.min), x, null, head);
            head.next = newNode;
            head = newNode;
        }
    }

    public void pop() {
        if (head == null) return;
        head = head.pre;
    }

    public int top() {
        if (head == null) return 0;
        return head.value;
    }

    public int getMin() {
        if (head == null) return 0;
        return head.min;
    }

    private class Node {
        int min;
        int value;
        Node next;
        Node pre;

        Node(int min, int value, Node next, Node pre) {
            this.min = min;
            this.value = value;
            this.next = next;
            this.pre = pre;
        }
    }
}
