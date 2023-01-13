import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ch=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)ch);
                
            }
            ch++;
            System.out.println();
        }
    }
}

/*
N=7;
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
 */
