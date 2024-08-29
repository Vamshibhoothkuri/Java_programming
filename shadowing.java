public class shadowing {
    static int x =20;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x;
       // System.out.println(x);//scope will begin when value is intialised
        x=80;//lower level will be over ride by upper level
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
