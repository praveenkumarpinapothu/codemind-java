import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double d=Math.sqrt(n);
        if((d-(int)d)>0)
        {
            System.out.println("False");}
        else{
            System.out.println("True");
        }
    }
}