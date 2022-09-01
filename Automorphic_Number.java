import java.util.*;
class Sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,sq;double r;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        sq=n*n;
        r=sq%Math.pow(10,d);
        if (r==n)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}