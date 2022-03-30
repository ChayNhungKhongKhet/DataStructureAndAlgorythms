package linkedlist.single;

public class SwapNodeInPair {
    public static ListNode swapPairs(ListNode head) {
        if (head.next != null) {
            int val = head.val;
            head.val = head.next.val;
            head.next.val = val;
            swapPairs(head.next);
        }
        return head;
    }
    public static void displayNode(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(12);
        ListNode node4 = new ListNode(10);
        ListNode node5 = new ListNode(7);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(6);
        ListNode head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        displayNode(head);
        head = swapPairs(head);
        displayNode(head);

    }
}
