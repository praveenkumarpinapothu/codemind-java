import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int[]x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(x[i]%2==0){
            continue;
            }
            else{
            c=1;
            }
        }
        if(c==1)
        System.out.println("False");
        else
        System.out.println("True");
    }
}