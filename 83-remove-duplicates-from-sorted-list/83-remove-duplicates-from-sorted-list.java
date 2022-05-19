/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode result=head;
        int t=head.val;
        while(head.next!=null&&head!=null)
        {
            if(head.next.val==t)
            {
                head.next=head.next.next;
                
            }
            else
            {
                t=head.next.val;
                head=head.next;
            }
        }
        return result;
        
    }
}