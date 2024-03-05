/*
Given a doubly linked list of n elements. Your task is to reverse the doubly linked list in-place.

Example 1:

Input:
LinkedList: 3 <--> 4 <--> 5
Output: 5 4 3
Example 2:

Input:
LinkedList: 75 <--> 122 <--> 59 <--> 196
Output: 196 59 122 75
*/

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class ReverseaDoublyLinkedList{
	public static Node reverseDLL(Node  head){
    //Your code here
	    if(head==null || head.next==null){
	        return head;
	    }
	    Node temp=head;
	    Node back=null;
	    while(temp!=null){
	        back=temp.prev;
	        temp.prev=temp.next;
	        temp.next=back;
	        temp=temp.prev;
	    }
	    
	    return back.prev;
	}
}
/*
OUTPUT
5 4 3
*/