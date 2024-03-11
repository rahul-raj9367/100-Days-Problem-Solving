/*
Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list whose sum is equal to given value target.

 

Example 1:

Input:  
1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
target = 7
Output: (1, 6), (2,5)
Explanation: We can see that there are two pairs 
(1, 6) and (2,5) with sum 7.
 

Example 2:

Input: 
1 <-> 5 <-> 6
target = 6
Output: (1,5)
Explanation: We can see that there is one pairs  (1, 5) with sum 6.

*/
/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/
class Findpairswithgivensumindoublylinkedlist{
	public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        
        // code here
        // ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // // Iterate through the linked list
        // Node current = head;
        // while (current != null) {
        //     // For each node in the linked list, iterate through the remaining nodes
        //     Node runner = current.next;
        //     while (runner != null) {
        //         // Check if the sum of data values of current and runner nodes is equal to the target
        //         if (current.data + runner.data == target && current.data + runner.data <= target) {
        //             // If the sum is equal to the target, add the pair to the result list
        //             ArrayList<Integer> pair = new ArrayList<>();
        //             pair.add(current.data);
        //             pair.add(runner.data);
        //             result.add(pair);
        //         }
        //         runner = runner.next;
        //     }
        //     current = current.next;
        // }
        // return result;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        Node left = head;
        Node right = head;
        while(right.next != null) right = right.next;
        
        while(left.data < right.data){
            int num1 = left.data;
            int num2 = right.data;
            if(num1+num2 == target){
                ArrayList<Integer> pair = new ArrayList<Integer>();
                pair.add(num1);
                pair.add(num2);
                arr.add(pair);
                left = left.next;
                right = right.prev;
            }else if ( num1 + num2 > target){
                right = right.prev;
            }else{
                left = left.next;
            }
            
        }
        return arr;
    }
}
/*
Output
(1, 6), (2,5)
*/