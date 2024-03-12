public class p12 {
    public static void main(String[] args) {
        int n=5;
        int spaces = 2*(n-1);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
                
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces -=2;
        }
    }
}
/*
 number,space,number
 n=1; 1,6,1
 n=2; 2,4,2


 1       1
12      21
123    321
1234  4321
1234554321


 */