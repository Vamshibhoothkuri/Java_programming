package Arrays.tasks;

import java.util.Arrays;

public class reversedforloop {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1,5,56};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int n = arr.length;
        
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
       System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}