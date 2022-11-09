import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y,x,rev;
        x=sc.nextInt();
        rev=0;
        while(x>0)
        {
           y=x%10; 
            rev=rev*10+y;
            x=x/10;
        }
        System.out.println(rev);
    }
}