package stackandqueue.array;

import stackandqueue.IStackAndQueue;

public class MyArrayQueue implements IStackAndQueue {

    private int headIndex, tailIndex;
    private int size;
    private int[] array;

    public MyArrayQueue(int size) {
        this.size = size;
        array = new int[size];
        tailIndex = headIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[headIndex];
            headIndex++;
            if (headIndex > tailIndex)
                headIndex = tailIndex = -1;
            return value;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return tailIndex == size-1;
    }

    @Override
    public boolean isEmpty() {
        return (tailIndex == -1) && (headIndex == -1);
    }

    @Override
    public void show() {
        if (isEmpty())
            System.out.println("Queue is empty !");

        else {
            System.out.print("[");
            for (int i = headIndex; i <= tailIndex; i++) {
                System.out.print(" "+array[i]);
            }
            System.out.println(" ]");
        }
    }
}
