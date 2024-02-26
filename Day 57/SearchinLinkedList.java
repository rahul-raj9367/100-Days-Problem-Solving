/*
Given a linked list of n nodes and a key , the task is to check if the key is present in the linked list or not.

Example:

Input:
n = 4
1->2->3->4
Key = 3
Output:
True
Explanation:
3 is present in Linked List, so the function returns true.
*/
class Node{
	int data;
	Node next;

	public Node(int data1,Node next1){
		this.data=data1;
		this.next=next1;
	}

	public Node(int data1){
		this.data=data1;
		this.next=null;
	}
}
class SearchinLinkedList{
	private static Node converArr2LL(int arr[]){
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=1;i<arr.length;i++){
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		return head;
	}
	private static  boolean findSearchinLinkedList(int arr[],int key,Node head){
		Node temp=head;
		while(temp!=null){
			if(temp.data==key){
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int key=4;
		Node head =converArr2LL(arr);
		System.out.println(findSearchinLinkedList(arr,key,head));
	}
}
/*
OUTPUT
true
*/