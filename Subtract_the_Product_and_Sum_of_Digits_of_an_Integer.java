import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r,sum=0,pro=1;
        while (n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
            
        }
        System.out.println(Math.abs(pro-sum));
    }
}