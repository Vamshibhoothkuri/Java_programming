package functions;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int ans=sum1();
        System.out.println(ans);
        sum();
    }
    /*syntax
       accessmodifier returntype name(){
       //body
       return statement;
       }
     */
    //int/char/long...etc->Return the value
    static int sum1() {
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter no.1: ");
        int num1=in.nextInt();
        System.out.println("Enter second no.:");
        int num2 =in.nextInt();
        int sum=num1+num2;
        return sum;
        //no futher will execute it stops at return
    }
    //void is used when we dont want to return something or just need print
    static void sum(){
        Scanner in=new Scanner(System.in); 
        System.out.println("Enter no.1: ");
        int num1=in.nextInt();
        System.out.println("Enter second no.:");
        int num2 =in.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
    }
}
