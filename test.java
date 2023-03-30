import java.util.*;
class Main{
    public static void main(String []ar)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        while(n-->0)
        {
            int max=0;
            for(int i=0;i<m;i++)
            {
                int val=sc.nextInt();
                max=Math.max(max,val);
            }
            System.out.print(max+" ");
        }
    }
}