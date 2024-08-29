import java.util.Scanner;

public class condition{
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();

    if(a>b && a>c){
        System.out.println("a is graeter");//mthod 1
    }
    else if(b>a && b>c){
        System.out.println("b");
    }
    else{
        System.out.println("C");
}
    int max=a;                             //mthod 2
    if(b>max){
        System.out.println(b);
    }
    else if(c>max){
        System.out.println(c);
    }
    else{
        System.out.println(a);
    }
    int Max=Math.max(c,Math.max(a,b));  //mthod 3
    System.out.println(Max);
  }
}