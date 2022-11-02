import java.util.*;
class Sample {
    public static void main(String[] args) {
       int sum=0,pro=1,d;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       while(n>0){
            d=n%10;
            sum+=d;
            pro*=d;
            n=n/10;
       }
       if(sum == pro)
        System.out.println("Spy Number");
       else
        System.out.println("Not Spy Number");
    }
}