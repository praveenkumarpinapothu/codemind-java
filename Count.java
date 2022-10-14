import java.util.*;
class Sample{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int oddcount=0,evencount=0;
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(x[i]%2==0)evencount++;
            else
            oddcount++;
        }
        System.out.println(evencount+" "+oddcount);
    }
}