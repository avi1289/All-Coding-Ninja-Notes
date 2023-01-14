import java.util.Scanner;

public class SumPatttern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int ref=0;
            for(int j=1;j<=i;j++){
                
                System.out.print(j);
                if(i!=j){
                    System.out.print("+");
                }else{
                    System.out.print("=");
                }
                ref+=j;
            }
            for(int j=1;j<=1;j++){
                System.out.print(ref);
            }            
            System.out.println();
        }
    }
}
/*
N=5;

1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15

 */
