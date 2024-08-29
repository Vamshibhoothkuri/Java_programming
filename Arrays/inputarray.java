package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class inputarray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //array on premitive
        // int[] ar=new int[5];
        // for(int i=0;i<ar.length;i++){
        //     ar[i]=in.nextInt();
        // }
    //     for(int j=0;j<ar.length;j++){
    //         System.out.print(ar[j]+" ");
    //  }
        // for(int n:ar){
        //        System.out.print(n+" ");//here n represents the every element in the array
        // }
        //System.out.println(Arrays.toString(str));//it gives string output--best one
        //System.out.println(ar[5]);//index out ot of bound
        String[] str=new String[4];
        for (int index = 0; index < str.length; index++) {
            str[index]=in.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[3]="vamshi";
        System.out.println(Arrays.toString(str));

}
}
