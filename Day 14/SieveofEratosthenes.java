/*
Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  

Input:
N = 10

Output:
2 3 5 7

Explanation:
Prime numbers less than equal to N 
are 2 3 5 and 7.
*/
import java.util.*;
class SieveofEratosthenes{
	static ArrayList<Integer> findSieveofEratosthenes(int n){
		ArrayList<Integer> list= new ArrayList<>();
		boolean[] isPrime = new boolean[n+1];

		for(int i=2;i<=n;i++){
			isPrime[i]=true;
		}
		
        for(int i=2;i*i<=n;i++){
        	if(isPrime[i]){
        		for(int j=i*i;j<=n;j+=i){
        			isPrime[j]=false;
        		}
        	}
        }

        for(int i=2;i<=n;i++){
        	if(isPrime[i]){
        		list.add(i);
        	}
        }

		return list;
	}
	public static void main(String[] args) {
		int n=10;
		ArrayList<Integer> list = findSieveofEratosthenes(n);
		for(int val:list){
			System.out.print(" "+val);
		}
	}
}
/*
OUTPUT
[2,3,5,701]
*/