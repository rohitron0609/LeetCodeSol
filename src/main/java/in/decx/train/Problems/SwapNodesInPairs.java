package in.decx.train.Problems;

import in.decx.train.Definitions.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head){
        if(head == null) return null;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            int tmpval = temp.val;
            temp.val = temp.next.val;
            temp.next.val = tmpval;

            temp = temp.next.next;
        }

        return head;
    }
}
