public class p11 {
    public static void main(String[] args) {
        int n=5;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         if(j==0) System.out.print("1");
        //         else if(j==1) System.out.print("0");
        //         else if(j % 2==0) System.out.print("1");
        //         else System.out.print("0");
        //     }
        //     System.out.println();
        // }

// 1
// 10
// 101
// 1010
// 10101

    for(int i=0;i<n;i++){
        int start=1;
        if(i %2 ==0 ) start=1;
        else start=0;
        for(int j=0;j<=i;j++){
            System.out.print(start);
            start=1-start;
        }
        System.out.println();
    }

    }
}

/*

1
01
101
0101
10101

 */