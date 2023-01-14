import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<=1;j++)
            {
                System.out.print("*");
            }
            if(i>1){
                for(int j=1;j<=i-1;j++){
                    System.out.print(j);
                }
            }
            int ref=i-2;
            if(i>2){
                for(int j=1;j<=i-2;j++){
                    System.out.print(ref);
                    ref--;
                }
            }
            if(i>1){
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=1;j++)
            {
                System.out.print("*");
            }
            if(i>1){
                for(int j=1;j<=i-1;j++){
                    System.out.print(j);
                }
            }
            int ref=i-2;
            if(i>2){
                for(int j=1;j<=i-2;j++){
                    System.out.print(ref);
                    ref--;
                }
            }
            if(i>1){
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            }
            System.out.println();
        }

    }
}


/*
N=3

*
*1*
*121*
*12321*
*121*
*1*
*


 */
