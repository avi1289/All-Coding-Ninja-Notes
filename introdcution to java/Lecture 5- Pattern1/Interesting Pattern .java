import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ch ='A'+n-1;
        for(int i=1;i<=n;i++){
            int pr =ch;
            for(int j=1;j<=i;j++){
                System.out.print((char)pr);
                pr++;
            }
            ch--;
            System.out.println();
        }
        }
}
