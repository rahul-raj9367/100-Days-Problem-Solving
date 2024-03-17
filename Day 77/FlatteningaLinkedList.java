/*
Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
(i) a next pointer to the next node,
(ii) a bottom pointer to a linked list where this node is head.
Each of the sub-linked-list is in sorted order.
Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order. 

Note: The flattened list will be printed using the bottom pointer instead of the next pointer.
For more clarity have a look at the printList() function in the driver code.

 

Example 1:

Input:
5 -> 10 -> 19 -> 28
|     |     |     | 
7     20    22   35
|           |     | 
8          50    40
|                 | 
30               45
Output:  5-> 7-> 8- > 10 -> 19-> 20->
22-> 28-> 30-> 35-> 40-> 45-> 50.
Explanation:
The resultant linked lists has every 
node in a single level.
(Note: | represents the bottom pointer.)
 

Example 2:

Input:
5 -> 10 -> 19 -> 28
|          |                
7          22   
|          |                 
8          50 
|                           
30              
Output: 5->7->8->10->19->22->28->30->50
Explanation:
The resultant linked lists has every
node in a single level.

(Note: | represents the bottom pointer.)
*/
/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
class FlatteningaLinkedList{
	Node flatten(Node root)
    {
	// Your code here
	    List<Integer> list =new ArrayList<>();
	    Node temp=root;
	    
	    while(temp!=null){
	        Node t2=temp;
	        while(t2!=null){
	            list.add(t2.data);
	            t2=t2.bottom;
	        }
	        temp=temp.next;
	    }
	    Collections.sort(list);
	    
	    Node head=converLL(list);
	    
	    return head;
    }
    static Node converLL(List<Integer> list){
        if(list.size()==0) return null;
        Node head=new Node(list.get(0));
        Node temp=head;
        for(int i=1;i<list.size();i++){
            Node newnode=new Node(list.get(i));
            temp.bottom=newnode;
            temp=temp.bottom;
        }
        
        return head;
    }
}
/*
OUTPUT
Output:  5-> 7-> 8- > 10 -> 19-> 20->
22-> 28-> 30-> 35-> 40-> 45-> 50.
*/