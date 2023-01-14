import java.util.*;
public class Solutions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ref=n;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=n;j>=i;j--)
            {
                System.out.print(ref);
            }
            ref--;
            System.out.println();
        }
    }
}
