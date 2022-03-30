package stackandqueue.linkedlist;

import stackandqueue.IStackAndQueue;

public class MyLinkedListStack implements IStackAndQueue {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }


    private Node topNode;

    public MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        Node node = new Node(value);
        if (!isFull() && topNode == null) {
            topNode = node;
            return true;
        }
        else if (topNode != null && !isFull()) {
            node.next = topNode;
            topNode = node;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = topNode.value;
            topNode = topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty())
            System.out.println("Stack is empty !");
        Node temp = topNode;
        while (temp != null) {
            System.out.print(temp.value + " ->");
            temp = temp.next;
            if (temp == null)
                System.out.print((Object) null);
        }
        System.out.println();
    }
}
