import java.util.*;
class Sample
{   
    public static int countDivisors(int m,int n,int k)
    {
        int count=0;
        for(int i=m;i<=n;i++)
        {
            if(i%k==0)
                count++;
        }
        return count;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(); 
        int r=sc.nextInt();
        int k=sc.nextInt();
       int result;
       result=countDivisors(l,r,k);
       System.out.println(result);
    }
}