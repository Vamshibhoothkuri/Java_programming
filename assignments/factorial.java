package assignments;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long num=in.nextLong();
        long fact=1;
        for(long i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
