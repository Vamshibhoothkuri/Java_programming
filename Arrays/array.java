package Arrays;

//when we want to store many data item then we use collection of data types is array
public class array {
    public static void main(String[] args) {
        //Q:store roll no.
        int a=19;
        //syntax
        //datatype[] variable_name=new datatype[size]
        int[] rolls=new int[6]; 
        //or
        int[] roll={1,2,3,4,5,6};//all item should be same datatype
        int[] rol;//Declaration:actually the stack defined here.declaration of array
        rol=new int[5];//Initialisation:here the object is being created in the memory(heap)
    }
}