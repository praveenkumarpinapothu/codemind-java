import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,k,c=0;
        n=sc.nextInt();
        int []x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++){
            if (isprime(x[i])){
                if(x[i]<=k){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    static boolean isprime(int n){
        if (n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}