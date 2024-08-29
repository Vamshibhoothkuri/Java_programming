package functions;
import java.util.Scanner;
public class parmeter {
    public static void main(String[] args) {
        // int ans = sum(22,89);
        // System.out.println(ans);  
        Scanner in= new Scanner(System.in);
        int c = in.nextInt();
        int b = in.nextInt();
        int ans=sum(c,b);
        System.out.println(ans);
    }
    static int sum(int a,int b){
        int sum1=a+b;
        return sum1;
    }
}
