package Scoping;

public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(marks);//we cannot access variable from another function
                                  //this is called scoping
    }
    static void ram(int marks){
        int num=200;
        System.out.println(num);
    }
}
