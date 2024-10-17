package Patterns;


public class Tables {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=5;j++){
                //System.out.print(String.format("%2dX%-2d=%-3d",j,i,j*i));
                System.out.print(j+"X"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
