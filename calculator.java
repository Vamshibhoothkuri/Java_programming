import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float ans=0;
        while(true){
            System.out.print("Enter operator :");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op=='/' || op=='%'){
                System.out.print("Enter two nums :");
                float num1=in.nextInt();
                float num2=in.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                else if(op=='-'){
                    ans=num1-num2;
                }
                else if(op=='*'){
                    ans=num1*num2;
                }
                else if(op=='/'){
                    if(num2!=0){
                    ans=num1/num2;
                    }
                }
                else if(op=='%'){
                    ans=num1%num2;
                }
            }
            else if(op=='X' || op=='x'){
               break;
            } 
            else{
                System.out.println("invalid input");
                }     
            System.out.println("num1 and num2 = "+ans);
        }
    }
  }
