import java.util.*;
class Sample
{
    public static int Findreverse(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<0)
        x=Math.abs(x);
        int y=Findreverse(x);
        if (y==x)
        System.out.println("2");
        else
        System.out.println("1");
    }
}