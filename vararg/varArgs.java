package vararg;
import java.util.Arrays;
//variable length Arguments
//when we dont know how many arguments we take then we use variable length arguments
public class varArgs {
   public static void main(String[] args) {
    funn(1,2,3,4,5,6,7);
    multiple(1,2,3,4,5,6);
    funn();
   }
   static void funn(int ...v){
    System.out.println(Arrays.toString(v));
   }
   static void multiple(int a,int b,int ...v){
    System.out.println(Arrays.toString(v));
   }
}
