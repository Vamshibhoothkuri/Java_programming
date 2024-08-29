package OOPs;

public class introduction {
    public static void main(String[] args) {
        
    // //storing rolls
    // int[] arr=new int[5];
    // //storing names
    // String[] arr1=new String[5];
    // //marks
    // float[] marks=new float[5];

    Student[] students=new Student[5];

    Student std1 = new Student(11,"mine",88);
    Student vamshi=new Student();
    Student std2 = new Student(vamshi);
    // std1.name="vamshi";
    // std1.roll=21;
    // std1.marks=88.5f;
    System.out.println(vamshi.name);
    // std1.greet();
    // std1.changename("vamshi");
    // System.out.println(std1.roll);
    // System.out.println(std1.name);
    // System.out.println(std1.marks);
}
}
class Student{
    int roll;
    String name;
    float marks;
    //constructors
    Student(){
        // this.name="vamshi bhoothkuri";
        // this.roll=12;
        // this.marks=89.2f;
        //This is how u call a constructer from another constructor
        this (11,"vam",55.5f);
    }
    void greet(){

        System.out.println("my name is "+this.name);
    }    
    void changename(String newname){
        this.name=newname;
    }
    //constructor in constructor
    Student(Student other){
        this.name=other.name;
        this.roll=other.roll;
        this.marks=other.marks;
    }
    Student(int roll,String name,float marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }
   }



