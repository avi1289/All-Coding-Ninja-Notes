public class Solution {
    public static void main(String[] args) {
        int N=4;
    for(int i=1;i<=N;i++)
    {
        int ref=i;
        for(int space=1;space<=N-i;space++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(ref);
            ref++;
        }
        ref-=2;
        if(i>1)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(ref);
                ref--;
            }            
        }                
        System.out.println();
    }
    }
}


/*
 N=4

   1
  232
 34543
4567654

 */
