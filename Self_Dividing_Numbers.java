import java.util.*;
class Sample{
    public static boolean selfdividing(int x){
        int s=x;
        while(x>0){
            int d=x%10;
            if(d==0)
                return false;
            if(s%d!=0)
                return false;
            x=x/10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            if(selfdividing(i)==true)
            System.out.print(i+" ");
        }
    }
}