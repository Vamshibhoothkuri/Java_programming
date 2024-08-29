package assignments;
import java.util.Scanner;
public class userzero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum=0;
        while(true){
            System.out.println("enter");
            int num=in.nextInt();
            if(num==0){
                System.out.println(sum);
                break;
            }
            else{
                sum=sum+num;
            }
       }
    }
}
