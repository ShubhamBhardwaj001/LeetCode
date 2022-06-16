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
    public int[] nextLargerNodes(ListNode head) {
        int ind=0;
        int size=getSize(head);
        int ans[]=new int[size];
        ListNode curr=head, nxt=head.next;
        while(curr.next!=null){
            if(nxt==null){
                ans[ind++]=0;
                curr=curr.next;
                nxt=curr.next;
            }else if(curr.val<nxt.val){
                ans[ind++]=nxt.val;
                curr=curr.next;
                nxt=curr.next;
            }else{
                nxt=nxt.next;
            }
        }return ans;
    }
    public int getSize(ListNode head){
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }return size;
    }
}