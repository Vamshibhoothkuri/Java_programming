package Patterns;

public class TaskVinsys {
    public static void main(String[] args) {
                int[]arr ={1,2,3,4,5,6,7,8,9,10};
                int sum = 0;
                int min =arr[0];
                int max = arr[0];
                System.out.println("Number with even indices");
                for(int i=0;i<arr.length;i+=2){
                    System.out.println(arr[i]);
                }
            System.out.println("\nNumbers with odd indices:");
            for(int i =1;i<arr.length;i+=2){
                System.out.println(arr[i]);
            }
            System.out.println("\nSquares of all numbers:");
            for(int num :arr){
                System.out.println(num*num);
            }
        for(int num :arr){
                if(num%2 == 0){
                    sum = sum+num;
                }
        }
        System.out.println("Even Numbers and their sum:"+sum);
        for(int num :arr){
                if(min > num){
                 min = num;
                }
                if(num > max){
                    max = num;
                }
        }
        System.out.println("Minimum element:" +min);
        System.out.println("Maximum element:" +max);
    }
}
