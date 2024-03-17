/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
*/
class ReverseNodesinkGroup{
	 public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevnode=null;
        
        while(temp!=null){
            ListNode kthnode=findkthNode(temp,k);
            if(kthnode==null){
                if(prevnode!=null){
                    prevnode.next=temp;
                    break;
                }
            }
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);

            if(temp==head){
                head=kthnode;
            }else{
                prevnode.next=kthnode;
            }

            prevnode=temp;
            temp=nextnode;
        }
        return head;

    }
    static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        return prev;
    }
    

    static ListNode findkthNode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }

        return temp;
    }
}
/*
OUTPUT
[2,1,4,3,5]
*/