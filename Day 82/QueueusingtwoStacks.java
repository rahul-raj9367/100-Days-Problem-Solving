/*
Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)

Note :- If there is no element return -1 as answer while popping.

Example 1:

Input:
5
1 2 1 3 2 1 4 2

Output: 
2 3

Explanation: 
In the first testcase
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2   poped element will be 2 the queue 
    will be {3}
1 4 the queue will be {3 4}
2   poped element will be 3.
Example 2:

Input:
4
1 2 2 2 1 4

Output: 
2 -1

Explanation: 
In the second testcase 
1 2 the queue will be {2}
2   poped element will be 2 and 
    then the queue will be empty
2   the queue is empty and hence -1
1 4 the queue will be {4}.
*/
class QueueusingtwoStacks{
	Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

     void Push(int x)
    {
       // Your code here
       s1.push(x);
    }
     
        
        //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
       // Your code here
       if(s1.isEmpty()) return -1;
       
       while(s1.size() > 1)
       {
           s2.push(s1.pop());
       }
       int va = s1.pop();
       
        while(s2.size() > 0)
       {
           s1.push(s2.pop());
       }
       return va;
    }
}
/*
OUTPUT
2 3
*/