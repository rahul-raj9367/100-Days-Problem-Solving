/*
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]
*/
class RotateList{
	public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        ListNode temp = head;
        if (head == null || k == 0) {
            return head;
        }
        int length = 1;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        if (k % length == 0) return head;

        tail.next = head;

        ListNode newTail = findKthNode(head, length - k % length);

        head = newTail.next;

        newTail.next = null;

        return head;
    }

    static ListNode findKthNode(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 1; i < k ; i++) {
            temp = temp.next;
        }
        return temp;
    }
}