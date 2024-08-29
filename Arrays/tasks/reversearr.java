package Arrays.tasks;
import java.util.Arrays;
public class reversearr {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        //int[] arrev= new int[5];
        reversed(ar);
        System.out.println(Arrays.toString(ar));
    //     int index=0;
    //     // reverse(ar);
    //     // System.out.println(Arrays.toString(ar));
    //     for(int i=ar.length-1;i>=0;i--){
    //         arrev[index]= ar[i];
    //         index++;
    //     }
    //     System.out.println(Arrays.toString(arrev));
    }
    static void reversed(int[] ar){
        int start=0;
        int end=ar.length-1;
        while(start>=end){
            swap(ar,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] ar,int index1,int index2){
        int temp=ar[index1];
        ar[index1]=ar[index2];
        ar[index2]=temp;
    }
}
