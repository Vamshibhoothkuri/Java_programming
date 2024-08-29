package Arrays;
import java.util.Arrays;
public class arrayout {
    public static void main(String[] args) {
    int[][] arr={   //we can also add diff no. of elements for each array
             {1,2,3,4},
             {5,6,7},
             {8,9,10,11}
         };
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //         System.out.print(arr[i][j]+" ");
    //     }
    //     System.out.println();
    // }
    for(int[] a:arr){
        System.out.println(Arrays.toString(a));
    }
}
}
