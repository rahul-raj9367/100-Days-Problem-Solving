/*
Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Example 1:

Input:
N = 8
value[] = {1,2,2,1,2,0,2,2}
Output: 0 1 1 2 2 2 2 2
Explanation: All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.
Example 2:

Input:
N = 4
value[] = {2,2,0,1}
Output: 0 1 2 2
Explanation: After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.

*/

//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Givenalinkedlistof0s1sand2ssortit{
	static Node segregate(Node head)
    {
        // add your code here
        if(head==null || head.next==null) return head;
        
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        
        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }else{
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        
        zero.next=(oneHead.next!=null)?(oneHead.next):(twoHead.next);
        one.next=twoHead.next;
        two.next=null;
        
        Node newhead=zeroHead.next;
        
        return newhead;
    }
}
/*
OUTPUT
0 1 1 2 2 2 2 2
*/