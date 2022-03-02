package LinkedList.Single;

public class _19_Remove_Nth_Node_From_End {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n-1 == 0))//Truong hop list chi co 1 node ma n == 1 thi xoa luon node head
            return null;
        int count = 0;
        ListNode cur = head;
        ListNode delete = head,bfDelete = null;
        while (cur.next != null){
            cur = cur.next;
            count ++;
            if (count >= n) {
                bfDelete = delete;
                delete = delete.next;
            }
        }
        if (bfDelete != null) { // Neu trong truon hop bfDelete != null thi chung to n ko nam trong list
            bfDelete.next = delete.next;
        }
        else if (delete == head)
            head = head.next;
        return head; // Nguoc lai khong lam j tra lai head
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
        var right = head;

        // move right to nth node from the head, thus creating a size-n gap between left and right
        for (var i = 0; i < n; i++)
            right = right.next;

        if (right == null)
            return head.next;

        ListNode prev = null;
        var left = head;

        while (right != null) {
            prev = left;
            left = left.next;
            right = right.next;
        }

        prev.next = left.next;
        return head;
    }



}
