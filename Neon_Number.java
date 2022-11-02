import java.util.*;
class Sample {
    public static void main(String[] args) {
       int sum=0,d;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       d=n*n;
       while(d!=0){
            int digit=d%10;
            sum+=digit;
            d=d/10;
       }
       if(n == sum)
        System.out.println("Neon Number");
       else
        System.out.println("Not Neon Number");
    }
    
}
