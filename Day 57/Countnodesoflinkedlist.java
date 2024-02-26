/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.


Example 1:
Input:
LinkedList: 1->2->3->4->5
Output: 5
Explanation: Count of nodes in the 
linked list is 5, which is its length.
*/
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class Countnodesoflinkedlist {
    private static Node convertArr2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp; // Update mover to point to the newly added node
        }
        return head;
    }

    private static int findLength(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node head = convertArr2LL(arr);
        System.out.println(findLength(head));
    }
}
/*
OUTPUT
5
*/