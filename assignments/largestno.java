package assignments;
import java.util.Scanner;
public class largestno {
    public static void main(String[] args) {
        int max=0;
        while(true){
            Scanner in=new Scanner(System.in);
            int num=in.nextInt();
            if(num!=0){
                if(num>max){
                    max=num;
                }
            }
            else{
                System.out.println(max);
                break;
            }
        }
    }
}
