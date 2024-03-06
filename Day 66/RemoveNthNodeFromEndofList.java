/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 
*/
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
class RemoveNthNodeFromEndofList{
	public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int res=count-n;
        temp=head;
        if(count==n){
            ListNode deletehead=head.next;
            return deletehead;
        }
        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
        // ListNode delete=temp.next;
        temp.next=temp.next.next;

        return head;
    }
}