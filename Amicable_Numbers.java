import java.util.*;
class Sample {
    public static int divisor(int x)
    {
        int sum=0;
        for (int i=1;i<=x/2;i++)
        {
            if (x%i==0)
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        if (divisor(m)==n)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
        
    }
        
}