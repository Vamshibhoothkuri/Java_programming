import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empid=in.nextInt();
        String dept=in.next();

        switch(empid){
            case 1:
            System.out.println("emp1");
            break;
            case 2:
            System.out.println("emp2");
            break;
            case 3:
            System.out.println("emp3");
            switch (dept) {
                case "IT":
                System.out.println("IT DEP");
                    break;
                case "NONIT":
                System.out.println("NONIT dEP");
                default:
                    break;
              }
            default:
            System.out.println("enter correct emp");

            }
        }
    }
