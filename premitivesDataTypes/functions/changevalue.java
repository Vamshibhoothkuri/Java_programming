package functions;
import java.util.Arrays;
public class changevalue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99; // if we change the object via ref variable,then i will changes the main object
    }
}
