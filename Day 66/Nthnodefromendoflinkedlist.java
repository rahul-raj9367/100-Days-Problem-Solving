/*
Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from the end of the linked list.

Example 1:
Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end is 8.

Example 2:
Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there
are 4 nodes in the linked list and we
need to find 5th from the end. Since 'n'
is more than the number of nodes in the
linked list, the output is -1.
*/

/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/
class Nthnodefromendoflinkedlist{
	 int getNthFromLast(Node head, int n){
    	// Your code here
    	
    	int count=0;
        Node temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count<n){
            return -1;
        }
        int res=count-n;
        temp=head;
        if(count==n){
            int data=head.data;
            return data;
        }
        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
        int s=temp.next.data;

        return s;
    }
}
/*
OUTPUT
8
*/