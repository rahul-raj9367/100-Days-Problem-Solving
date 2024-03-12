/*
Given a doubly linked list of n nodes sorted by values, the task is to remove duplicate nodes present in the linked list.

Example 1:

Input:
n = 6
1<->1<->1<->2<->3<->4
Output:
1<->2<->3<->4
Explanation:
Only the first occurance of node with value 1 is 
retained, rest nodes with value = 1 are deleted.
Example 2:

Input:
n = 7
1<->2<->2<->3<->3<->4<->4
Output:
1<->2<->3<->4
Explanation:
Only the first occurance of nodes with values 2,3 and 4 are 
retained, rest repeating nodes are deleted.
*/
class Removeduplicatesfromasorteddoublylinkedlist{
	Node removeDuplicates(Node head){
        Node temp=head;
        
        while(temp!=null && temp.next!=null){
            Node nextnode=temp.next;
            while(nextnode!=null && nextnode.data==temp.data){
                nextnode=nextnode.next;
            }
            
            temp.next=nextnode;
            if(nextnode!=null){
                 nextnode.prev=temp;
            }
            
            temp=temp.next;
            
        }
        
        return head;
    }
}
/*
OUTPUT
1<->2<->3<->4
*/