package stackandqueue.array;

public class MyCircularQueue {

    private int[] data;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue(int size) {
        this.size = size;
        head = tail = -1;
        data = new int[size];
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        else if (isEmpty())
            head = tail = 0;

        else
            if (tail == size-1)
                tail = 0;
            else
                tail++;
        data[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        if (head == tail) { // cuoi dau trung -> chi con 1 phan tu
            head = tail = -1;
            return true;
        }
        if (head == size-1)
            head = 0;
        else head++;
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : data[head];
    }

    public int Rear() {
        return isEmpty() ? -1 : data[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return (tail+1) % size == head; // % cho size boi vi neu tail = size -1
                                    // thi cong 1 se co so du bang 0 bang index hien tai cua head (head = 0)
                                    // neu chi cong 1 thi khong bao gom tail o cuoi va head dung dau
    }

}