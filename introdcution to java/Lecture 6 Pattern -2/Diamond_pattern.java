import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int st=0;
        for (int i = 1; i <= n/2+1; i++) {
            for(int space=1;space<=n/2+1-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n/2; i >=1; i--) {
            for(int space=1;space<=n/2+1-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }          
}
