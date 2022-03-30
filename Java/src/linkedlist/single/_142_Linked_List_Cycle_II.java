package linkedlist.single;



public class _142_Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        while (head != null){
            var result = checkNode(head);
            if (result == 1)
                return head;
            else if (result == -1)
                return null;
            else head = head.next;
        }
        return null;
    }

    public int checkNode(ListNode cur) {

        if (cur == null || cur.next == null)
            return -1;
        var slow = cur;
        var fast = cur;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                if (fast == cur)
                    return 1;
                else return 0;
        }
        return -1;
    }
}
