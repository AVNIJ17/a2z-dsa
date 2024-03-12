public class p7{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
               System.out.print(" "); 
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*"); 
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" "); 
            }
            System.out.println();
        }
        
    }
}
/*
 space,star,space

 (n-i-1),(2i+1),(n-i-1)
n=0; 4,1,4
n=1 ; 3,3,3


    *    
   ***   
  *****  
 ******* 
*********



 */