import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(x[i]%k!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}