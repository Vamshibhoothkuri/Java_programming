import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch =in.nextLine().trim().charAt(0);
        System.out.println(ch);
        if (ch>='a' && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }
        // String word = "hello world";
        // System.out.println(word.charAt(6));
    }
}