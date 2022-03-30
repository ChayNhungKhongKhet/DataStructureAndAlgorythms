package stackandqueue;


import stackandqueue.array.MyCircularQueue;

public class Main {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        boolean ss = myCircularQueue.enQueue(6);
        System.out.println(ss); // return True
        int s1 = myCircularQueue.Rear();
        System.out.println(s1); // return True
        int v = myCircularQueue.Rear();
        System.out.println(v); // return True
        System.out.println(myCircularQueue.deQueue()); // return False
        boolean is = myCircularQueue.enQueue(6);
        System.out.println(is);     // return 3
        System.out.println(myCircularQueue.Rear());   // return True
        System.out.println(myCircularQueue.deQueue());  // return True
        int value = myCircularQueue.Front();
        System.out.println(value); // return True
        boolean s = myCircularQueue.deQueue();
        System.out.println(s);     // return 4
        s = myCircularQueue.deQueue();
        System.out.println(s);
        s = myCircularQueue.deQueue();
        System.out.println(s);

//        MyCircularQueue obj = new MyCircularQueue(3);
//        boolean param_1 = obj.enQueue(2);
//        System.out.println(param_1);
//        boolean param_2 = obj.deQueue();
//        System.out.println(param_2);
//        int param_3 = obj.Front();
//        System.out.println(param_3);
//        int param_4 = obj.Rear();
//        System.out.println(param_4);
//        boolean param_5 = obj.isEmpty();
//        System.out.println(param_5);
//        boolean param_6 = obj.isFull();
//        System.out.println(param_6);

    }
}
