import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.println("hey!How are you?");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.print(input.next());
        System.out.print(input.nextLine());
    }
}
