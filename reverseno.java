public class reverseno {
    public static void main(String[] args) {
        int num=93895;
        String ch=" ";
        int reverse=0;
        // while(num>0){
        //    int remainder=num%10;
        //   // String ch1=String.valueOf(remainder);
        //    String ch1=Integer.toString(remainder);
        //    num=num/10;
        //    ch=ch+ch1; 
        // }
        // System.out.println("ch"+ch);
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
