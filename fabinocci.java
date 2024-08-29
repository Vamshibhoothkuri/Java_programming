import java.util.Scanner;
public class fabinocci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        // int sum =0;
        // for(int i=2;i<=n;i++){
        //     sum = a+b;                //Using For Loop
        //     a=b;
        //     b=sum;
        // }
        // System.out.println(sum);

        //Another way
       int count=2;
       while(count<=n){
        int temp=b;                     //Using While Loop
        b=a+b;
        a=temp;
        count++;
       }
       System.out.println(b);
    }
}
