package assignments;
import java.util.Scanner;
public class subandmulnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int pro=1;
        int sum=0;
        while(num>0){
        int rem=num%10;
        pro=pro*rem;
        sum=sum+rem;
        num=num/10;
        }
        System.out.println(pro-sum);
    }
}
