import java.util.Scanner;

public class Inputprimitive{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your roll no");
        int rollno = input.nextInt();
        System.out.println("please enter your name");
        String name = input.next();
        System.out.println("UR Roll "+ rollno);
        System.out.println("UR name "+ name);
    }
}
