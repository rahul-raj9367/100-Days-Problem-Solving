/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []
*/
class MergekSortedLists{
	public ListNode mergeKLists(ListNode[] lists) {
        // List<Integer> list=new ArrayList<>();

        // for(int i=0;i<lists.length;i++){
        //     ListNode temp=lists[i];
        //     while(temp!=null){
        //         list.add(temp.val);
        //         temp=temp.next;
        //     }
        // }
        // Collections.sort(list);
        // ListNode head=convertLL(list);

        // return head;
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head=lists[0];
        for(int i=1;i<lists.length;i++){
            head=merge2lists(head,lists[i]);
        }
        return head;

    }
   static public ListNode merge2lists(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(-1);
	    ListNode current = dummyHead;

	    while (l1 != null && l2 != null) {
	        if (l1.val < l2.val) {
	            current.next = l1;
	            l1 = l1.next;
	        } else {
	            current.next = l2;
	            l2 = l2.next;
	        }
	        current = current.next;
	    }

	    // Append remaining nodes from either list
	    current.next = (l1 != null) ? l1 : l2;

	    return dummyHead.next;
    }

    static ListNode convertLL(List<Integer> list){
        if(list.size()==0) return null;
        ListNode head=new ListNode(list.get(0));
        ListNode temp=head;
        for(int i=1;i<list.size();i++){
            ListNode newnode=new ListNode(list.get(i));
            temp.next=newnode;
            temp=newnode;
        }

        return head;
    }
}
/*
OUTPUT
Output: [1,1,2,3,4,4,5,6]
*/