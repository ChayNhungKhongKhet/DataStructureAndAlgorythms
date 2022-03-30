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
            tail = (tail+1) % size;//+1 o day vi tail ban dau bang -1
        // % size thi so du luon nho hon size
        // % size thi khi tail = size -1 ,duoc cong 1 len thi tail = 0 quay lai index ban dau
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
        head = (head+1) % size; //Cycle khi head = size -1
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