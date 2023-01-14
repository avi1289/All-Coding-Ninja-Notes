import java.util.Scanner;

public class odd_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int odd=2*i-1;
            for(int j=n;j>=i;j--){
                System.out.print(odd);
                odd+=2;
            }
            int addVal=1;
            for(int j=1;j<=i-1;j++){
                System.out.print(addVal);
                addVal+=2;
            }
            System.out.println();
        }        
    }
}

/*
N=4;

1357
3571
5713
7135

 */
