 import java.util.*;
class Ascending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a; 
            a=sc.nextInt();
            
            if (a>h)
            {
                h=a;
            }
            else
            {
                h=0;
                System.out.println("no");
                break;
            }
        }
        if (h!=0)
            System.out.println("yes");
    }
}