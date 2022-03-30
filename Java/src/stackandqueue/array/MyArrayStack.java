package stackandqueue.array;

import stackandqueue.IStackAndQueue;

import java.util.Arrays;

public class MyArrayStack implements IStackAndQueue {

    private int[] array;
    private int size;
    private int topIndex;
    public MyArrayStack(int size) {
        this.size = size;
        array = new int[size];
        topIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return topIndex == size-1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void show() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            for (int i = topIndex;i >= 0; i--)
                System.out.println("|" + array[i] + "  |");
            System.out.println();
        }
    }
}
