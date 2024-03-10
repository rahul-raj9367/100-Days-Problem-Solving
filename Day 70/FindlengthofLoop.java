/*
Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains a loop or not and if the loop is present then return the count of nodes in a loop or else return 0. C is the position of the node to which the last node is connected. If it is 0 then no loop.



Example 1:

Input:
N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C = 4
Output: 7
Explanation: The loop is 45->33. So
length of loop is 33->10->21->39->
90->58->45 = 7. The number 33 is
connected to the last node to form the
loop because according to the input the
4th node from the beginning(1 based
index) will be connected to the last
node for the loop.
Example 2:

Input:
N = 2
value[] = {1,0}
C = 1
Output: 2
Explanation: The length of the loop
is 2.
*/
/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

class FindlengthofLoop{
	static int countNodesinLoop(Node head){
        //Add your code here.
        Node slow=head;
        Node fast=head;
        // int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return findlooplength(slow,fast);
            }
        }
        return 0;
    }
    static int findlooplength(Node slow,Node fast){
    	fast=fast.next;

    	int count=1;
    	while (slow!=fast) {
    		count++;
    		fast=fast.next;
    	}

    	return count;
    }
}