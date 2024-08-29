package vararg;
//overloading where two functions has same name but diff parameters
public class overloading {
    public static void main(String[] args) {
        System.out.println(sum(1,2,45));
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
