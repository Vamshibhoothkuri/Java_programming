import java.util.Scanner;
public class arstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(arm(num));
        for(int i=100;i<1000;i++){//multiple times of numbers
            if(arm(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean arm(int num){
        int orr=num;
        int temp=0;
        while(num>0){
            int c=num%10;
            num=num/10;
            temp=c*c*c + temp;
        }
        return temp==orr;
    }
}
