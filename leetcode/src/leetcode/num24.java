package leetcode;

class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next !=null && curr.next.next !=null){
            ListNode n1 = curr.next;
            ListNode n2 = curr.next.next;
            curr.next = n2;
            n1.next=n2.next;
            n2.next = n1;
            curr=n1;

        }
        return dummy.next;
    }
}
