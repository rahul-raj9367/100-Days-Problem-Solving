/*
A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457
Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 
Example 2:

Input:
LinkedList: 1->2->3
Output: 124 
*/
/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/
class Add1toanumberrepresentedaslinkedlist{
	public static Node addOne(Node head) {
		head=reverse(head);
		Node temp=head;
		int carry=1;
		while(temp!=null){
			temp.data=temp.data+carry;

			if(temp.data<10){
				carry=0;
				break;
			}else{
				temp.data=0;
				carry=1;
			}

			temp=temp.next;
		}

		if(carry==1){
			Node newnode=new Node(1);
			head=reverse(head);
			newnode.next=head;

			return newnode;
		}

		head=reverse(head);
		return head;

	}
	static Node reverse(Node head){
		Node prev=null;
		Node temp=head;

		while(temp!=null){
			Node front=temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
	}
}
/*
OUTPUT
457
*/
