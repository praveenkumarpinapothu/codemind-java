import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,len,d1,d2;
        n=sc.nextInt();
        r=sc.nextInt();
        len=(int)Math.log10(n)+1;
        d2=n%(int)Math.pow(10,r);
        d1=n/(int)Math.pow(10,len-r);
        System.out.println(Math.abs(d1-d2));
    }
}