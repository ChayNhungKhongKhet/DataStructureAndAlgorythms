package linkedlist.single;

public class _141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head,slow = head;//fast = slow.next when start to conditional not true when start loop 1
        while (fast != null && fast.next != null){ //stop conditional 1 is fast == null prove not cycle
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)                      //stop conditional 2 is fast.next not null to fast not be NullPointer Exception
                return true;                       //After n loop fast == slow ,if not I didn't see cycle
        }
        return false;
    }
}
