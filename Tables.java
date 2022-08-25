import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i=1;
        n=sc.nextInt();
        r=sc.nextInt();
        while(i<=r)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
            i=i+2;
        }
    }
}