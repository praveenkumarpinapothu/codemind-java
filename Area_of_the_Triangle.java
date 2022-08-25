import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        float s=(float)(x+y+z)/2;
        float a=(float)(Math.sqrt(s*(s-x)*(s-y)*(s-z)));
        System.out.format("%.2f",a);
    }
}