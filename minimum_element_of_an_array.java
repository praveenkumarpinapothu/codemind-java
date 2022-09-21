import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,h=100000;
        n=sc.nextInt();
        int[]x=new int[n];
        for(i=0;i<n;i++){
            int a=sc.nextInt();
            x[i]=a;
            if(a<h){
                h=a;
            }
        }
        System.out.println(h);
    }
}