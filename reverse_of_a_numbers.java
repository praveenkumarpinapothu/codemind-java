import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),r;
        while(n>0)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;
            
        }
    }
}