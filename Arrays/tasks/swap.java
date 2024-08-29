package Arrays.tasks;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(ar));
        reversed(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void reversed(int[] ar){
        int start=0;
        int end=ar.length-1;
        while(start<end){
            swap1(ar,start,end);
            start++;
            end--;
        }
    }
    static void swap1(int[] ar,int index1,int index2){
        int temp=ar[index1];
        ar[index1]=ar[index2];
        ar[index2]=temp;
    }
}
