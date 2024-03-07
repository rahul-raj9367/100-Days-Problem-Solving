/*
Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
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
class PalindromeLinkedList{
	public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null) return true;

        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode newhead=reverseLL(slow.next);
        ListNode first=head,second=newhead;

        while(second!=null){
            if(first.val!=second.val){
                reverseLL(newhead);
                return false;
            }
            first=first.next;
            second=second.next;
        }

         reverseLL(newhead);
        return true;
    }

    static ListNode reverseLL(ListNode head){
        // if(head==null || head.next==null){
        //     return head;
        // }
        
        // ListNode newhead=reverseLL(head.next);
        // ListNode front=head.next;
        // head.next=front;
        // head.next=null;

        // return newhead;
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        } 

        return prev;      
       

    }
}