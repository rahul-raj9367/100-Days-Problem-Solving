/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]
*/
class RemoveDuplicatesfromSortedListII{
	  public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        
        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val == temp.next.next.val) {
                int duplicateValue = temp.next.val;
                while (temp.next != null && temp.next.val == duplicateValue) {
                    temp.next = temp.next.next;
                }
            } else {
                temp = temp.next;
            }
        }
        
        return dummy.next;
    }
}
/*
OUTPUT
[1,2,5]
*/