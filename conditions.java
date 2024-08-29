public class conditions {
    public static void main(String[] args) {
        int salary=15000;
        if (salary<10000){
            salary=salary+1000;
        }
        else if (salary>20000){
            salary=salary +750;
        }
        else{
            salary=salary+500;
        }
        System.out.println(salary);
    }
}
