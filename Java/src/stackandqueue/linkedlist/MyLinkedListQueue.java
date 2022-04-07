package stackandqueue.linkedlist;

import linkedlist.single.ListNode;
import stackandqueue.IStackAndQueue;

public class MyLinkedListQueue implements IStackAndQueue {

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;

    public MyLinkedListQueue() {
        head = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull())
            return false;
        Node node = new Node(value);
        Node temp = head;
        if (head == null) {
            head = node;
            return true;
        }
        while (temp.next!=null)
            temp = temp.next;
        temp.next = node;
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int val = head.value;
        head = head.next;
        return val;
    }

    @Override
    public boolean isFull() {
        return false;
    }


    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+ " ->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
}
