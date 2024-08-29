package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class multiD_2D {
    public static void main(String[] args) {
        //int[][] ar=new int[3][3];
        // int[][] ar={
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // int[][] arr={   //we can also add diff no. of elements for each array
        //     {1,2,3,4},
        //     {5,6,7},
        //     {8,9,10,11}
        // };
        Scanner in=new Scanner(System.in);
        //System.out.println(arr[0]);
        int[][] arr2D=new int[3][3];
        for(int i=0;i<arr2D.length;i++){
            //for each row in every row
            for(int j=0;j<arr2D[i].length;j++){

                arr2D[i][j]=in.nextInt();
            }
        }
        //output way1
        // for(int i=0;i<arr2D.length;i++){
        //     //for each row in every row
        //     for(int j=0;j<arr2D[i].length;j++){
        //         System.out.print(arr2D[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //output way 2
    //     for(int i=0;i<arr2D.length;i++){
    //         System.out.println(Arrays.toString(arr2D[i]));
    // }
    // System.out.println();

    //output3
    for(int[] a:arr2D){
    System.out.println(Arrays.toString(a));
    }
    // System.out.println();
}
}
