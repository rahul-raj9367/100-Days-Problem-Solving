/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:

Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
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
class RemoveDuplicatesfromSortedList{
	 public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;

        while(temp!=null && temp.next!=null){
            ListNode nextnode=temp.next;
            while(nextnode!=null && nextnode.val==temp.val){
                nextnode=nextnode.next;
            }

          
            temp.next=nextnode;
            temp=temp.next;
        }

        return head;

         
    }
}
/*
Output: [1,2]
*/