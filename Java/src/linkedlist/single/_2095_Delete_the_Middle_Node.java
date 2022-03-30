package linkedlist.single;

public class _2095_Delete_the_Middle_Node {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode slow = head ,fast = head,bfSlow = null;//Have two pointer pointer1 speed = speed ,pointer2 speed = 2 speed
        while (fast != null && fast.next != null) {//After fast.next == null if(number node is even) // fast == null if (number node is odd)
            bfSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
            bfSlow.next = slow.next;
        return head;
    }


}
