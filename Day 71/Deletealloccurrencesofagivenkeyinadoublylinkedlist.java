/*
You are given the head of a doubly Linked List and a Key. Your task is to delete all occurrences of the given key and return the new DLL.

Example:

Input: 
2<->2<->10<->8<->4<->2<->5<->2
2
Output: 
10<->8<->4<->5
Explanation: 
All Occurences of 2 have been deleted.
*/
/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/
class Deletealloccurrencesofagivenkeyinadoublylinkedlist{
	static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==x){
                if(temp==head){
                    head=head.next;
                }
                Node prevval=temp.prev;
                Node nextval=temp.next;
                
                if(prevval!=null){
                    prevval.next=nextval;
                }
                
                if(nextval!=null){
                    nextval.prev=prevval;
                }
                
                temp=nextval;
            }else{
                temp=temp.next;
            }
        }
        
        return head;
    }
}
/*
Output: 
10<->8<->4<->5
*/