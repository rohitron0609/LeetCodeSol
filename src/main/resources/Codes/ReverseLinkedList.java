/*
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head){
        ListNode output = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = output;
            output.next = head;
            head = temp;
        }
        return output;
    }
}
 */