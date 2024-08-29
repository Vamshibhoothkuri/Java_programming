package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class functionarray {
    public static void main(String[] args) {
        int[] n={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(n));
        change(n);
        System.out.println(Arrays.toString(n));
    }
    static void change(int[] ar){
        ar[3]=8;
    }
}
