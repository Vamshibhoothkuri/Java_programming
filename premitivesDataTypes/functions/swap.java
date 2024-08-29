package functions;

public class swap {
    public static void main(String[] args) {
        int a= 20;
        int b= 9;
        swap(a,b);
        System.out.println(a+","+b);
    }
    static void swap(int a,int b){
        int temp =a; //it dont changes because it will creates new object dont changes and we cannot change premitives
        a=b;
        b=temp;
        System.out.println(a+","+b);
    }
}
