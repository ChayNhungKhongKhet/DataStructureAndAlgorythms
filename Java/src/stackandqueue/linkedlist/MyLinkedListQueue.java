package stackandqueue.linkedlist;

import linkedlist.single.ListNode;
import stackandqueue.IStackAndQueue;

public class MyLinkedListQueue implements IStackAndQueue {

    private ListNode topNode;

    public MyLinkedListQueue() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        ListNode node = new ListNode(value);

        return false;
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void show() {

    }
}
