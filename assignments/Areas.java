package assignments;
import java.util.Scanner;
public class Areas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // float r=in.nextFloat();
        // double circlearea=r*r*3.14;
        // System.out.println(circlearea);
        
        // float h=in.nextFloat();
        // float b=in.nextFloat();
        // double trianglearea=b*h/2;
        // System.out.println(trianglearea);

        float h=in.nextFloat();
        float b=in.nextFloat();
        double triangleisosceles=b/4*Math.sqrt(4*h*h - b*b);
        System.out.println(triangleisosceles);
    }
}
