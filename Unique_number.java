import java.util.*;
class Sample
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(uni(n));
        
    }
    static String uni(int n){
        int x1;
        while(n>0){
            x1=n%10;
            n=n/10;
            int n1=n;
            while(n1>0){
                int x2=n1%10;
                n1=n1/10;
                if(x1==x2)
                {
                    return "Not Unique Number";
                }
            }
        }return "Unique Number";
    }
}