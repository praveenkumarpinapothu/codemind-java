import java.util.*;
class Digits
{   
    public static int Largestdigit(int n)
    {
        int r,max=0;
        while(n>0)
        {
            r=n%10;
            if(r>max)
                max=r;
            n=n/10;
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),Result=0;
        Result=Largestdigit(n);
        System.out.println(Result);
    }
}