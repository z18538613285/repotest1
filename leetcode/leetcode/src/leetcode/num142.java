package leetcode;

class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        Boolean isCycle = false;

        while (fast.next !=null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                isCycle=true;
                break;
            }
        }
        if (!isCycle){
            return null;
        }
        fast =head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}
