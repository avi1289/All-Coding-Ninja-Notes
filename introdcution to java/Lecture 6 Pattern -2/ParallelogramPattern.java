import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int str=1;str<=n;str++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
N=5;

*****
 *****
  *****
   *****
    *****

 */
