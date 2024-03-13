/*
Given the head of a linked list, return the list after sorting it in ascending order.

 

Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Example 3:

Input: head = []
Output: []
*/
class SortList{
	 static ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode middle=findMiddle(head);
        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;

        left=sortList(left);
        right=sortList(right);

         return merge2LL(left,right);
    }
    static ListNode merge2LL(ListNode list1, ListNode list2) {
	    ListNode dummyNode = new ListNode(-1);
	    ListNode temp = dummyNode;

	    while (list1 != null && list2 != null) {
	        if (list1.val < list2.val) {
	            temp.next = list1;
	            list1 = list1.next;
	        } else {
	            temp.next = list2;
	            list2 = list2.next;
	        }
	        temp = temp.next; 
	    }

	    if (list1 != null) {
	        temp.next = list1;
	    } else {
	        temp.next = list2;
	    }

    	return dummyNode.next;
	}
}
/*
OUTPUT
[1,2,3,4]
*/