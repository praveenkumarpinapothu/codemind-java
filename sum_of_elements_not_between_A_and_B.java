import java.util.*;
class Sample{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++){
            if(x[i]<a || x[i]>b){
               sum+=x[i]; 
            }
        }
        System.out.println(sum);
    }
}