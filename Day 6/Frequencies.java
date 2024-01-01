/*
Input:
N = 5
arr[] = {2, 3, 2, 3, 5}
P = 5
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
*/
import java.util.*;
import java.util.Map;
class Frequencies{

    //{"Key":value}pair
    static Map<Integer,Integer> findFrequencies(int arr[],int p){

        Map<Integer,Integer> fmap=new HashMap<>();

        for(int num: arr){
            fmap.put(num,fmap.getOrDefault(num,0)+1);
        }
        return fmap;
    }

	public static void main(String[] args) {
        int arr[]={2, 3, 2, 3, 5};
        int n=5;
        int p=5;

        Map<Integer,Integer> fmap = findFrequencies(arr,p);

        System.out.println("Output:");
        for(int i=1;i<=n;i++){
            System.out.print(fmap.getOrDefault(i,0)+" ");
        }

    }
}
/*
Output:
0 2 2 0 1
*/
