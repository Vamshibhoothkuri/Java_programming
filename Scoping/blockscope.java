package Scoping;

public class blockscope {
    public static void main(String[] args) {
        int a=90;
        int b=9;
        {
           // int a //it cannot initialized in block already in initilized in function
           a=80;//but we can reassign original ref vriable
           int c=99;//values initialized in this block remain in block
        }
        int c =787;//values can reintialized in cause it created in block
        System.out.println(a);

        //scoping in for loop
        for(int i=0;i<6;i++){
            int num =90;//i,num cannot be used outside the loop as it was initilised in loop
        }
    }
}
