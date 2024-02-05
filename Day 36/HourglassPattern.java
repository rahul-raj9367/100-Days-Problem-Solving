/*
* * * * * * * * *  
  * * * * * * *     
    * * * * *      
      * * *          
        *         
      * * *         
    * * * * *       
  * * * * * * *     
* * * * * * * * *
*/
class HourglassPattern{
	public static void main(String[] args) {
		int n = 5;
        int stars =2*n-1;
        int spaces = 0;
        
        for (int i=0;i<2*n-1;i++) {
            // Space
            for (int j=0;j<spaces;j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j=0;j<stars;j++) {
                System.out.print("* ");
            }

            if (i<n-1){
                spaces+=2;
                stars-=2;
            } else {
                spaces-=2;
                stars+=2;
            }
            System.out.println();
        }
	}
}
/*
OUTPUT
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/