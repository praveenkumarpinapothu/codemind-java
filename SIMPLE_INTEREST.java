import java.util.*;
class Sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,t,r,ans;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        ans=(p*t*r)/100;
        System.out.println(ans);
    }
}