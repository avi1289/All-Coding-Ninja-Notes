import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int  number =sc.nextInt();
        int position =getPosition(number);
        
        System.out.print(position);
        
    }
    static int getPosition(int n){
        if(n==1 || n==2){
            return 1;
        }
        return getPosition(n-1)+getPosition(n-2);
    }
}
