package Patterns;

public class Occurenceele {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int num=10;
        int count=0;
        for(int i:arr){
            if(i==num){
                count++;
            }
        }
        System.out.println(count);
    }
}
