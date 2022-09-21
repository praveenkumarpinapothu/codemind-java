import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,count=0,s=0;
        n=sc.nextInt();
        int []x=new int[n];
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            if(isprime(c)){
                count++;
                s=s+c;
            }
            x[i]=c;
        }
        double r=(double)s/count;
        System.out.printf("%.2f",r);
        
    }
    static boolean isprime(int n){
        if(n==1){
            return false;
        }
        for (int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
}