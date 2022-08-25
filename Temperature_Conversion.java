import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        double ans = (double)((n*1.8)+32);
        System.out.printf("%.2f",ans);
    }
}