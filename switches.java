import java.util.Scanner;
public class switches {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // String fruit= in.next();
       /*** ''' 
        if(fruit.equals("Mango")){  //if we use == it will gives false if the variable creates two diff objects for variable
            System.out.println("King of fruits");
        }
        if(fruit.equals("apple")){
            System.out.println("red sweet");
        }'''*/
        // switch(fruit){    //it will directly jumps into to actual case instead of checking all the conditions line by line
        //     case "mango":
        //         System.out.println("king of fruits");
        //         break;
        //     case "apple":
        //         System.out.println("sweet red");
        //         break;  //if we did not keep break then it will print all next outputs 
        //     case "banana":
        //         System.out.println("yellow sweet");
        //         break;
        //     default:
        //         System.out.println("enter correct fruit");                
        int day = in.nextInt();
        //This is the another way of doing
        // switch(day){
        //     case 1 -> System.out.println("Sunday");
        //     case 2 -> System.out.println("Monday");
        //     case 3 -> System.out.println("Tuesday");
        //     case 4 -> System.out.println("Wednesday");
        //     case 5 -> System.out.println("Thursday");
        //     case 6 -> System.out.println("Friday");
        //     case 7 -> System.out.println("Saturday");
        //     default -> System.out.println("Enter valid no");
        // }
        switch(day){
        case 1, 2, 3, 4, 5-> System.out.println("weekdays"); 
        case 6,7 ->System.out.println("weekend");
        default -> System.out.println("Enter valid no");
    }
    }
}
