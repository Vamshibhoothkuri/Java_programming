package ArrayLists;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Syntyax
        ArrayList<Integer> list= new ArrayList<>(10);
        // list.add(45);
        // list.add(55);
        // list.add(65);
        // list.add(75);
        // list.add(85);
        // list.remove(2);
        // list.set(2,40);
        // list.contains(55);
        // System.out.print(list.set(0,99));
        // System.out.println(list);

    for(int i=0;i<5;i++){
        list.add(in.nextInt());
    }
    
    for(int i=0;i<5;i++){
        System.out.println(list.get(i));//pass inex here,List[index] syntax does not work here]
    }
    System.out.println(list);
    }
} 
