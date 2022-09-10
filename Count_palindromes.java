import java.util.*;
class Sample{
    public static boolean rev(int n){
        int sum=0,r;
        int ans = n;
        while (n>0){
        r=n%10;
        sum=sum*10+r;
        n=n/10;
        }
        return sum==ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c =0;
        int[] arr = new int[n];
        for(int i =0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i =0;i<n;i++)
        {
            if(rev(arr[i]))c++;
        }
        System.out.println(c);
    }
}