import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int st=0;
        for (int i = 1; i <= n; i++) {
           for(int space=1;space<=n-i;space++)
           {
                System.out.print(" ");
           }
           
           for(int str=1;str<=i+st;str++)
           {
            System.out.print("*");
           }
           st++;
        System.out.println();
        }
    }
}

/*
N=4;
   *
  ***
 *****
*******

 */
