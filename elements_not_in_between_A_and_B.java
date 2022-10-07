import java.util.*;
class Sample{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++){
            if(x[i]<a || x[i]>b){
                System.out.print(x[i]+" ");
                count++;
            }
        }
        if(count==0)
            System.out.println("-1");
    }
}