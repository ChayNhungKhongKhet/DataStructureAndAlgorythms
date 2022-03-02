package LinkedList.Single;

public class _160_Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        var lenA = 0;
        var lenB = 0;
        var startA = headA;
        var startB = headB;
        while (startA != null) {
            lenA++;
            startA = startA.next;
        }
        startA = headA;
        while (startB != null){
            lenB++;
            startB = startB.next;
        }
        startB = headB;
        if (lenA <= lenB) {
            for (int i = 0; i < (lenB-lenA); i++) {
                startB = startB.next;
            }
        }
        else for (int i = 0; i < (lenA-lenB); i++) {
            startA = startA.next;
        }
        while (startA != null && startB != null) {
            if (startA == startB)
                return startA;
            else {
                startA = startA.next;
                startB = startB.next;
            }
        }
        return null;
    }


}
