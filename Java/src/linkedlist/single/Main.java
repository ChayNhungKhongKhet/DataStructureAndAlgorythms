package linkedlist.single;

import java.util.Scanner;

public class Main {
    static final Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        _160_Intersection_of_Two_Linked_Lists intersection = new _160_Intersection_of_Two_Linked_Lists();
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(88);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(33);
        ListNode listNode5 = new ListNode(62);
        ListNode listNode6 = new ListNode(2022);
        ListNode listNode7 = new ListNode(88);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next = listNode6;
//        listNode3.next = listNode4;

        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        ListNode node;
        if ((node = intersection.getIntersectionNode(listNode1,listNode4)) != null)
            System.out.println(node.val);
        else System.out.println("Chung ta ko thuoc ve nhau");

    }
}
