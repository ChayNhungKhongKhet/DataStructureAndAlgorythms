package LinkedList.Single;

public class MyLinkedList {
    private ListNode head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if (head == null)
            return -1;
        if (index == 0)
            return head.val;
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
            index --;
            if (index == 0)
                return temp.val;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
        size ++;
    }

    public void addAtTail(int val) {
        if (head == null)
            addAtHead(val);
        ListNode node = new ListNode(val);
        ListNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
        size ++;
    }

    public void addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        if (head == null)
            head = node;
        else if (index == 0)
            addAtHead(val);
        else if (index == size-1)
            addAtTail(val);
        else {

            ListNode temp = head;
            ListNode bfTemp = null;
            while (temp.next != null) {
                bfTemp = temp;
                temp = temp.next;
                index --;
                if (index == 0){
                    bfTemp.next = node;
                    node.next = temp;
                    size ++;
                }
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null)
            return;
        ListNode bfTemp = null;
        ListNode temp = head;
        if (index == 0){
            bfTemp = head;
            head = head.next;
            bfTemp.next = null;
            size --;
        }
        while (temp.next != null){
            bfTemp = temp;
            temp = temp.next;
            index --;
            if (index == 0){
                bfTemp.next = temp.next;
                temp.next = null;
                size --;
            }
        }
    }

    public void displayLinkedList() {
        if (head == null){
            System.out.println("List is empty !!!");
            return;
        }

        ListNode temp = head;
        while (temp != null){
            if (temp.next == null){
                System.out.print(temp.val +"==>null");
                return;
            }
            System.out.print(temp.val +"==>");
            temp = temp.next;
        }
    }
    public void sort() {

    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(10);
        myLinkedList.addAtHead(17);
        myLinkedList.addAtHead(9);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtHead(0);
        myLinkedList.addAtHead(112);
        myLinkedList.addAtHead(88);
        myLinkedList.addAtTail(99);
        myLinkedList.addAtTail(19);
        myLinkedList.addAtIndex(0,100);
        myLinkedList.addAtIndex(10,200);
        myLinkedList.displayLinkedList();
        myLinkedList.deleteAtIndex(11);
        System.out.println();
        myLinkedList.displayLinkedList();

//        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
//        myLinkedList.displayLinkedList();
//        System.out.println();
//        System.out.println(myLinkedList.get(1));             // return 2
//        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//        System.out.println(myLinkedList.get(1));
//        System.out.println();
//        myLinkedList.displayLinkedList();

    }

}
