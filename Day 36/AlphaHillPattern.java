/*
Input Format: N = 6
Result:   
     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 
ABCDEFEDCBA
*/
class AlphaHillPattern{
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++){

			//space
			for(int j=i+1;j<n;j++){
				System.out.print(" ");
			}

			char ch='A';
			int breakPoint=(2*i+1)/2;
			
			//Letters
			for(int j=0;j<2*i+1;j++){
				System.out.print(ch);
				if(j>=breakPoint){
					ch--;
				}else{
					ch++;
				}
			}

			System.out.println();
		}	
	}
}
/*
OUTPUT
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA
*/