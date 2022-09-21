import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,k,i;
        n=sc.nextInt();
        int[]x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int sum=0;
        for(i=0;i<n;i++){
           sum+=x[i];
           if (x[i]==k)
           break;
        }
       System.out.println(sum);
    }
}