package LinkedList.Single;

import java.util.ArrayList;
import java.util.List;

public class _876_Middle_of_Linked_List {
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        List<ListNode> listNodes = new ArrayList<>();
        while (head.next != null){
            listNodes.add(head);
            head = head.next;
        }
        listNodes.add(head);
        int lastIndex = listNodes.size()-1;
        if (lastIndex % 2 ==0)
            return listNodes.get((lastIndex/2));
        return listNodes.get((lastIndex/2)+1);
    }

    public static ListNode middleNode2(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
