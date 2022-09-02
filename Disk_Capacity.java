import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println((long)(n*n1*n2*512*2));
    }
}