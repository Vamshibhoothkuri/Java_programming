import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int num = input.nextInt();
        //System.out.println(num);

        //typecasting
        int num1 = (int)(88.8);
        System.out.println(num1);
        
        //automatic type promotion in expressions
        int a=258;
        byte b=(byte)(a);
        System.out.println(b);//op will be 1 as byte has max of 256

    }
    
}
