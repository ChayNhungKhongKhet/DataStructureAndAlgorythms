package stackandqueue;

import stackandqueue.linkedlist.MyLinkedListQueue;
import stackandqueue.linkedlist.MyLinkedListStack;

public class Main {
    public static void main(String[] args) {
        MyLinkedListStack queue = new MyLinkedListStack();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.pop());
        System.out.println(queue.push(2));
        queue.show();
        System.out.println(queue.push(4));
        queue.show();
        System.out.println(queue.push(7));
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();
        System.out.println(queue.pop());
        queue.show();

    }
}
